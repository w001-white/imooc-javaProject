#用pandas对其进行展示，并进行可视化。
import json
import pandas as pd
import numpy as np
import matplotlib as mpl
import matplotlib.pyplot as plt
import seaborn as sns

#读取json数据集并用图表格式显示
path = './datasets/bitly_usagov/example.txt'
records = [json.loads(line) for line in open(path)]
frame = pd.DataFrame(records)

#对时区进行计数（用panda 的value_counts函数进行计数）
#首先对数据进行预处理，我们可以先给记录中的未知或缺失的时区值填上一个替代值。
clean_tz = frame['tz'].fillna('Missing')
clean_tz[clean_tz == ''] = 'Unknown'
count = clean_tz.value_counts() #该函数对tz的各个元素进行计数并按降序进行排列
#取出前十名并进行可视化
tz_counts = count[:10]
sns.barplot(y = clean_tz.counts.index, x = clean_tz.counts.values)

#求出百分占比并进行可视化
def normaltotal(setdata):
    percent = setdata/setdata.sum()
    return percent
tz_percent = normaltotal(count)

tz_percents = tz_percent[:10]
sns.barplot(y = tz_percents.index, x = tz_percents.values)
scale_ls = [i/10 for i in range(11)]
index_ls = [str(int((i*100)))+'%' for i in np.linspace(0,1,11)]
plt.xticks(scale_ls,index_ls)
plt.title('各时区所占百分比')
plt.show()

#2.求出Windows用户和非Windows用户，定义维度a中包含了Windows的为Windows用户，其余为非Windows用户。
cframe = frame[frame.a.notnull()]
cframe['os'] = np.where(cframe['a'].str.contains('Windows'), 'Windows', 'NotWindows')
by_tz_os = cframe.groupby(['tz','os'])
agg_count = by_tz_os.size().unstack().fillna(0)
agg_count
count_subset = agg_count.loc[agg_count.sum(1).nlargest(10).index]
count_subset = count_subset.stack()
count_subset.name = 'total'
count_subset = count_subset.reset_index()

#求出Windows用户NotWindows用户百分占比并进行可视化
def  normaltotal2(group):
    group['percent']= group.total/group.total.sum()
    return group
result = count_subset.groupby('tz').apply(normaltotal2)
sns.barplot(x = 'percent', y = 'tz', hue='os', dataset=result)
scale_ls = [i/10 for i in range(11)]
index_ls = [str(int((i*100)))+'%' for i in np.linspace(0,1,11)]
plt.xticks(scale_ls,index_ls)
plt.title('在同一时区下windows和notwindows用户的比例')
plt.show()
