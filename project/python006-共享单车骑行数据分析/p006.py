import pandas as pd
import calendar
from datetime import datetime
import matplotlib.pyplot as plt
import seaborn as sn
import numpy as np
from pylab import mpl

mpl.rcParams['font.sans-serif'] = ['Simhei']


def collect_and_process_data():
    bikedata = pd.read_csv("F:/train.csv")
    # 数据提取
    # 提取年月日
    bikedata['date'] = bikedata.datetime.apply(lambda x: x.split()[0])
    # 提取小时

    bikedata['hour'] = bikedata.datetime.apply(lambda x: x.split()[1].split(":")[0])

    # 在年月日的基础上提取星期数（需要格式化日期）day_name 转化为英文名称
    bikedata['weekday'] = bikedata.date.apply(
        lambda dateString: calendar.day_name[datetime.strptime(dateString, '%Y/%m/%d').weekday()])
    # print(bikedata)
    # 在年月日的基础上提取月份  month_name 转化为英文名称
    bikedata["month"] = bikedata.date.apply(
        lambda dateString: calendar.month_name[datetime.strptime(dateString, '%Y/%m/%d').month])

    # 数据转化
    # 将season数字转化为英文季节值
    bikedata["season"] = bikedata.season.map({1: "Spring", 2: "Summer", 3: "Fall", 4: "Winter"})
    # print(bikedata)
    # 将以下变量转化为分类变量
    varlist = ['hour', 'weekday', 'month', 'season', 'holiday', 'workingday']
    for x in varlist:
        bikedata[x] = bikedata[x].astype('category')
    # print(bikedata.dtypes)

    # 删除无意义的变量
    bikedata.drop('datetime', axis=1, inplace=True)
    # print(bikedata)

    # 数据清洗
    # 查看是否缺失数据
    #print(bikedata.describe())

    # 查看是否有异常值
    fig, axes = plt.subplots(nrows=2, ncols=2)
    fig.set_size_inches(12,12)
    sn.boxplot(data=bikedata, y='count', orient='v', ax=axes[0][0])
    sn.boxplot(data=bikedata, y='count', x='season', orient='v', ax=axes[0][1])
    sn.boxplot(data=bikedata, y='count', x='hour', orient='v', ax=axes[1][0])
    sn.boxplot(data=bikedata, y='count', x='workingday', orient='v', ax=axes[1][1])
    #     # plt.show()

    axes[0][0].set(ylabel='骑行人数', title='骑行人数')
    axes[0][1].set(xlabel='季节', ylabel='骑行人数', title='不同季节的骑行人数')
    axes[1][0].set(xlabel='时间', ylabel='骑行人数', title='一天内不同时间骑行人数')
    axes[1][1].set(xlabel='工作日', ylabel='骑行人数', title='工作日骑行人数')
    plt.savefig('Abnormal_value_analysis.png')
    # plt.show()

    # 剔除数据
    bikedata1 = bikedata[np.abs(bikedata["count"] - bikedata["count"].mean()) <= (3 * bikedata["count"].std())]
    # print("剔除前数据记录：", bikedata.shape, "\n剔除前数据记录：", bikedata1.shape)
    bikedata1.to_csv('processed_data.csv')
    return bikedata1


def Data_Analysis_and_Visualization_month(bikedata):
    # 判断每个月份有几条记录，并按由大到小顺序排序
    monthAggregated = pd.bikedata(bikedata.groupby("month")["count"].mean()).reset_index()
    # print(monthAggregated)
    monthSorted = monthAggregated.sort_values(by="count", ascending=False)
    # print(monthSorted)


    fig, axes = plt.subplots()
    fig.set_size_inches(12, 20)
    sortOrder = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                 "November", "December"]
    sn.barplot(data=monthSorted, x="month", y="count", order=sortOrder)
    axes.set(xlabel="月份", ylabel="平均骑行人数", title="不同月份的骑行人数")
    plt.savefig('result1.png')
    plt.show()


def Data_Analysis_and_Visualization_hour(bikedata):
    # 一周内不同时间的骑行人数
    hourAggregated = pd.DataFrame(bikedata.groupby(["hour", "weekday"])["count"].mean()).reset_index()
    print(hourAggregated)


    fig1, ax1 = plt.subplots()
    fig1.set_size_inches(12, 20)
    hueOrder = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
    sn.pointplot(x=hourAggregated["hour"], y=hourAggregated["count"], hue=hourAggregated["weekday"], hue_order=hueOrder,
                 data=hourAggregated)
    ax1.set(xlabel="时间", ylabel="骑行人数", title="一周内不同时间的骑行人数")

    plt.savefig("result2.png")
    plt.show()


# 主函数
def main():
    # 数据采集\查看和处理
    bikedata1 = collect_and_process_data()
    # 数据分析与可视化1
    Data_Analysis_and_Visualization_month(bikedata1)
    # 数据分析与可视化2
    Data_Analysis_and_Visualization_hour(bikedata1)


if __name__ == '__main__':
    main()
