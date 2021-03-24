# coding: utf-8

# ## 读取excel

# In[1]:

import numpy as np
from pandas import Series,DataFrame
import pandas as pd


# In[2]:

file_name = 'F:/课程/大数据/大作业/朝阳医院/yiyuan001.xlsx'
xls = pd.ExcelFile(file_name)
dataDF = xls.parse('Sheet1',dtype='object')
dataDF.head() # 只列出前5行数据


# ## 查看基本信息

# In[3]:

# 查看数据的形状，即几行几列
dataDF.shape


# In[4]:

# 查看索引
dataDF.index


# In[5]:

# 查看每一列的列表头内容
dataDF.columns


# In[6]:

# 查看每一列数据统计数目
dataDF.count()


# ## 数据清洗

# #### 列名重命名  

# In[7]:

# 使用rename函数，把"购药时间" 改为 "销售时间"
dataDF.rename(columns={'购药时间':'销售时间'},inplace=True)
dataDF.head()


# #### 缺失数据处理

# In[8]:

print('删除缺失值前：',dataDF.shape)
dataDF.info()

# 使用dropna函数删除缺失值
dataDF = dataDF.dropna(subset=['销售时间','社保卡号'],how='any')

print('\n删除缺失值后：',dataDF.shape)
dataDF.info()


# #### 数据类型转换

# In[9]:

# 将字符串转为浮点型数据
dataDF['销售数量'] = dataDF['销售数量'].astype('float')
dataDF['应收金额'] = dataDF['应收金额'].astype('float')
dataDF['实收金额'] = dataDF['实收金额'].astype('float')
dataDF.dtypes


# In[10]:

# 定义函数将星期去除
def splitSaletime(timeColser):
    timelist = []
    for val in timeColser:
        data = val.split(' ')[0] # [0]表示选取的分片，这里表示切割完后选取第一个分片
        timelist.append(data)

    # 将列表转行为一维数据Series类型
    timeSer = Series(timelist)
    return timeSer

# 获取"销售时间"这一列数据
time = dataDF.loc[:,'销售时间']
# 调用函数去除星期，获得日期
data = splitSaletime(time)
# 修改"销售时间"这一列的值
dataDF.loc[:,'销售时间'] = data
dataDF.head()


# In[11]:

# 字符串转日期
'''
errors='coerce'如果原始数据不符合日期的格式，转换后的值为NaT
format 是原始数据中日期的格式
'''
dataDF.loc[:,'销售时间'] = pd.to_datetime(dataDF.loc[:,'销售时间'],format='%Y-%m-%d',errors='coerce')
dataDF.dtypes


# In[12]:

'''
转换日期过程中不符合日期格式的数值会被转换为空值None，
这里删除列（销售时间，社保卡号）中为空的行
'''
dataDF = dataDF.dropna(subset=['销售时间','社保卡号'],how='any')


# #### 数据排序

# In[13]:

# 按销售时间进行升序排序
dataDF = dataDF.sort_values(by='销售时间',ascending=True)
dataDF.head()


# In[14]:

# 重置索引（index）
dataDF = dataDF.reset_index(drop=True)
dataDF.head()


# #### 异常值处理

# In[15]:

# 查看描述统计信息
dataDF.describe()


# In[16]:

# 将"销售数量"这一列中小于0的数排除掉
pop = dataDF.loc[:,'销售数量'] > 0
dataDF = dataDF.loc[pop,:]

# 排除异常值后再次查看描述统计信息
dataDF.describe()


# ## 构建模型及数据可视化

# ### 业务指标1：月均消费次数

# 计算总消费次数

# In[17]:

# 删除重复数据
kpi1_Df = dataDF.drop_duplicates(subset=['销售时间','社保卡号'])
# 有多少行
totalI = kpi1_Df.shape[0]
print('总消费次数=',totalI)


# 计算月份数

# In[18]:

# 排序
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

# In[19]:

kpi1_I = totalI // monthsI
print('业务指标1：月均消费次数=',kpi1_I)


# ### 业务指标2：月均消费金额

# In[20]:

# 总消费金额
totalMoneyF = dataDF.loc[:,'实收金额'].sum()
# 月均消费金额
monthMoneyF = totalMoneyF // monthsI
print('业务指标2：月均消费金额=',monthMoneyF)


# ### 业务指标3：客单价

# In[21]:

# 客单价 = 总消费金额 / 总消费次数
pct = totalMoneyF / totalI
print('业务指标3：客单价=',pct)


# ### 业务指标4：消费趋势

# In[22]:

import matplotlib.pyplot as plt
import matplotlib

# 画图时用于显示中文字符
from pylab import mpl
mpl.rcParams['font.sans-serif'] = ['SimHei']   # SimHei是黑体的意思

# 在操作之前先复制一份数据，防止影响清洗后的数据
groupDf = dataDF


# #### 每天的消费金额

# In[23]:

# 重命名行（index）为销售时间所在列的值
groupDf.index = groupDf['销售时间']
groupDf.head()


# In[24]:

# 画图
plt.plot(groupDf['实收金额'])

plt.title('按天消费金额图')
plt.xlabel('时间')
plt.ylabel('实收金额')
# 保存图片
plt.savefig('F:/课程/大数据/大作业/朝阳医院/day.png')
# 显示图片
plt.show()


# #### 每月的消费金额

# In[25]:

# 将销售时间聚合按月分组
gb = groupDf.groupby(groupDf.index.month)
print(gb)


# In[26]:

# 应用函数，计算每个月的消费总额
monthDf = gb.sum()
print(monthDf)


# In[27]:

# 描绘按月消费金额图
plt.plot(monthDf['实收金额'])
plt.title('按月消费金额图')
plt.xlabel('月份')
plt.ylabel('实收金额')
plt.savefig('F:/课程/大数据/大作业/朝阳医院/month.png')
plt.show()


# #### 药品销售情况

# In[28]:

# 聚合统计各种药品的销售数量
medicine = groupDf[['商品名称','销售数量']]
bk = medicine.groupby('商品名称')[['销售数量']]
re_medicine = bk.sum()

# 对药品销售数量按降序排序
re_medicine = re_medicine.sort_values(by='销售数量',ascending=False)

re_medicine.head()


# In[29]:

# 截取销售数量最多的十种药品
top_medicine = re_medicine.iloc[:10,:]
print(top_medicine)


# In[30]:

# 用条形图展示销售数量前十的药品
top_medicine.plot(kind='bar')

plt.title('药品销售前十情况')
plt.xlabel('药品种类')
plt.ylabel('销售数量')
plt.legend(loc=0)
plt.savefig('F:/课程/大数据/大作业/朝阳医院/medicine.png')
plt.show()