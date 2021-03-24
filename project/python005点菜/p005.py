import numpy as np
from pandas import Series,DataFrame
import pandas as pd

file_name = 'F:/课程/大数据/实训/菜品推荐/数据/菜品.xlsx'
xls = pd.ExcelFile(file_name)
dataDF = xls.parse('Sheet1',dtype='object')
dataDF.head()

dataDF.shape         #查看数据的形状，即几行几列
dataDF.index         #查看索引
dataDF.columns         #查看每一列的列表头内容
dataDF.count()         #查看每一列数据统计数目

# 使用rename函数，把"购药时间" 改为 "销售时间"
dataDF.rename(columns={'贩卖时间':'销售时间'},inplace=True)
dataDF.head()
dataDF.isnull().any()
# #### 缺失数据处理
print('删除缺失值前：',dataDF.shape)
dataDF.info()

# 使用dropna函数删除缺失值
dataDF = dataDF.dropna(subset=['销售时间','顾客','菜品','价格','是否好评','实收金额','店铺满意度'],how='any')


print('\n删除缺失值后：',dataDF.shape)
dataDF.info()
dataDF.dtypes

# 将字符串转为浮点型数据
dataDF['价格'] = dataDF['价格'].astype('float')
dataDF['实收金额'] = dataDF['实收金额'].astype('float')
dataDF['店铺满意度'] = dataDF['店铺满意度'].astype('float')

print('\n更改后数据类型：',dataDF.shape)
dataDF.info()
dataDF.dtypes

# 按销售时间进行升序排序
dataDF = dataDF.sort_values(by='销售时间',ascending=True)
dataDF.head()

# 重置索引（index）
dataDF = dataDF.reset_index(drop=True)
dataDF.head()

# 查看描述统计信息
dataDF.describe()

# 删除重复数据
kpi1_Df = dataDF.drop_duplicates(subset=['销售时间'])
# 有多少行
totalI = kpi1_Df.shape[0]
print('总消费次数=',totalI)

# 按销售时间升序排序
kpi1_Df = kpi1_Df.sort_values(by='销售时间',ascending=True)
# 重命名行名（index）
kpi1_Df = kpi1_Df.reset_index(drop=True)

# 获取时间范围
# 最小时间值
startTime = kpi1_Df.loc[0,'销售时间']
# 最大时间值
endTime = kpi1_Df.loc[totalI-1,'销售时间']

# 计算月份数
# 天数
daysI = (endTime-startTime).days
# 月份数：运算符"//"表示取整除，返回商的整数部分
monthsI = daysI // 30
print('月份数：',monthsI)

# 计算月均消费次数
kpi1_I = totalI // monthsI
print('餐馆月营额天数=',kpi1_I)

# 总消费金额
totalMoneyF = dataDF.loc[:,'实收金额'].sum()
# 月均消费金额
monthMoneyF = totalMoneyF // monthsI
print('月均销售金额=',monthMoneyF)

# 平均销售额度 = 总消费金额 / 总消费次数
pct = totalMoneyF / totalI
print('平均销售额度=',pct)

# ### 业务指标4：消费趋势
import matplotlib.pyplot as plt
import matplotlib
# 画图时用于显示中文字符
from pylab import mpl
mpl.rcParams['font.sans-serif'] = ['SimHei']   # SimHei是黑体的意思

# 先复制一份数据，防止影响清洗后的数据
groupDf = dataDF

# 重命名行（index）为销售时间所在列的值
groupDf.index = groupDf['销售时间']
groupDf.head()

# 画图
plt.plot(groupDf['实收金额'])
plt.title('按天消费金额图')
plt.xlabel('时间')
plt.ylabel('实收金额')
# 保存图片
plt.savefig('F:/课程/大数据/实训/菜品推荐/数据/day.png')
# 显示图片
plt.show()

# 将销售时间聚合按月分组
gb = groupDf.groupby(groupDf.index.month)
print(gb)
# 应用函数，计算每个月的消费总额
monthDf = gb.sum()
print(monthDf)
# 描绘按月消费金额图
plt.plot(monthDf['实收金额'])
plt.title('按月消费金额图')
plt.xlabel('月份')
plt.ylabel('实收金额')
plt.savefig('F:/课程/大数据/实训/菜品推荐/数据/month.png')
plt.show()

# 聚合统计各种菜品的销售数量
medicine = groupDf[['菜品','价格']]
bk = medicine.groupby('菜品')[['价格']]
re_medicine = bk.sum()

# 对菜品销售数量按降序排序
re_medicine = re_medicine.sort_values(by='价格',ascending=False)

re_medicine.head()


# In[29]:

# 截取销售数量最多的十种菜品
top_medicine = re_medicine.iloc[:10,:]
print(top_medicine)


# In[30]:

# 用条形图展示销售数量前十的菜品
top_medicine.plot(kind='bar')

plt.title('销售前十情况')
plt.xlabel('菜品种类')
plt.ylabel('顾客')
plt.legend(loc=0)
plt.savefig('F:/课程/大数据/实训/菜品推荐/数据/medicine.png')
plt.show()