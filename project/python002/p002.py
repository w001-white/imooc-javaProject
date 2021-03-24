import json
from pyspark import SparkContext, SparkConf
from pyspark.sql import SparkSession
import math


def func(i_ts):
    """
    对token的value做归一化
    :param i_ts:
    :return:
    """
    item = i_ts[0]
    ts_list = i_ts[1]
    sum = 0
    for ts in ts_list:
        token = ts[0]
        score = ts[1]
        sum += pow(float(score), 2) #求同一个item所有token平方和
    ss = math.sqrt(sum) #将平方和开放
    tis_list = []
    for ts in ts_list:
        token = ts[0]
        score = ts[1]
        tis_list.append((token, (item, float(score) / ss))) #归一化
    return tis_list


def itemTopN(rdd):
    """
    将token对应的所有item按分数排序，取TOP50
    :param rdd:
    :return:
    """
    Max_list_len = 50
    token = rdd[0]
    is_list = rdd[1]
    is_sort = sorted(is_list, key=lambda i_s: i_s[1], reverse=True)#将item按score排序
    is_list_len = len(is_list)
    if len(is_list) > Max_list_len:
        is_list_len = Max_list_len
    top_list = []
    for i in range(is_list_len):
        top_list.append((is_sort[i][0], (token, is_sort[i][1])))
    return top_list


def pair(rdd):
    """
    取pair对
    :param rdd:
    :return: ((itemA,itemB),score)
    """
    item_score_list = rdd[1]
    pair_list = []
    for i in range(0, len(item_score_list) - 1):
        for j in range(i + 1, len(item_score_list)):
            item_a, score_a = item_score_list[i]
            item_b, score_b = item_score_list[j]
            pair_list.append(((item_a, item_b), score_a * score_b))
            pair_list.append(((item_b, item_a), score_a * score_b))
    return pair_list


def process_sort(rdd):
    """
    推荐结果排序并取TOP20
    :param rdd:
    :return:
    """
    item = rdd[0]
    is_list = rdd[1]
    Max_similary = 20
    is_sort = sorted(is_list, key=lambda i_s: i_s[1], reverse=True)
    if len(is_sort) > Max_similary:
        is_sort = is_sort[:Max_similary]
    return (item, is_sort)
#  kv_list = []
#  for k,v in is_sort:
#     kv = str(k)+":"+str(v)
#     kv_list.append(kv)
#  kv_str = "_".join(kv_list)
#  return item+"\t"+kv_str


if __name__ == '__main__':

    spark_conf = SparkConf().setMaster("spark://epwk004:7077").setAppName("sparkCB").set("spark.driver.maxResultSize",
                                                                                         "12g").set("spark.executor.memory",
                                                                                                    '6g')

    spark_context = SparkContext.getOrCreate(conf=spark_conf)
    # sparkContext 也可以通过下面的语句转换成sparkSession对象
    spark = SparkSession(spark_context)
    # spark连接hbase，读取RDD数据
    host = 'master'
    table = 'music'
    conf = {"hbase.zookeeper.quorum": host, "hbase.mapreduce.inputtable": table}
    keyConv = "org.apache.spark.examples.pythonconverters.ImmutableBytesWritableToStringConverter"
    valueConv = "org.apache.spark.examples.pythonconverters.HBaseResultToStringConverter"
    hbase_rdd = spark.sparkContext.newAPIHadoopRDD("org.apache.hadoop.hbase.mapreduce.TableInputFormat",
                                                   "org.apache.hadoop.hbase.io.ImmutableBytesWritable",
                                                   "org.apache.hadoop.hbase.client.Result", keyConverter=keyConv,
                                                   valueConverter=valueConv, conf=conf)

    hbase_rdd = hbase_rdd.flatMapValues(lambda v: v.split("\n")).mapValues(json.loads).persist()
    # 1.将数据转换成(token,(item,value))的格式
    tisRDD = hbase_rdd.map(lambda x: (x[0], (x[1]['qualifier'], x[1]['value'])))
    # 2.过滤掉value小于1的行
    fRDD = tisRDD.filter(lambda x: float(x[1][1]) > 1)
    # 3.按token键分组
    groupRDD = fRDD.groupByKey().mapValues(list)
    # 4.截断阶段，对每个token对应的item排序，只去前50个item
    topRDD = groupRDD.flatMap(itemTopN).groupByKey().mapValues(list)
    # 5.对token的value做归一化
    guiyiRDD = topRDD.flatMap(func).groupByKey().mapValues(list)
    # 6.取pair对((itemA,itemB),score)格式
    pairRDD = guiyiRDD.flatMap(pair)
    # 7.将相同pair对的value加和得最终物品相似度打分,得到(itemA,[(itemB,score),(itemC:score)])格式
    iisRDD = pairRDD.reduceByKey(lambda x, y: (x + y)).map(lambda x: (x[0][0], (x[0][1], x[1]))).groupByKey().mapValues(
        list)
    # 8.格式转换后入库
    resultRDD = iisRDD.map(process_sort)
    resultRDD.saveAsTextFile("/data/CB_Rec")


