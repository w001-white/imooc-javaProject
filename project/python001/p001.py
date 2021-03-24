import math
import pandas as pd
import numpy as np
import os
os.chdir('F:\课程\大数据\实训\用户收视的节目数据')
def createItemsProfiles(data_array, labels_names, items_names):
    items_profiles = {}
    for i in range(len(items_names)):
        items_profiles[items_names[i]] = {}
        for j in range(len(labels_names)):
            items_profiles[items_names[i]][labels_names[j]] = data_array[i][j]
    return items_profiles

def createUsersProfiles(data_array, users_names, items_names, labels_names, items_profiles):
    users_profiles = {}
    users_average_scores_list = []

    items_users_saw = {}
    items_users_saw_scores = {}

    for i in range(len(users_names)):

        items_users_saw_scores[users_names[i]] = []
        items_users_saw[users_names[i]] = []
        count = 0
        sum = 0.0
        for j in range(len(items_names)):

            if data_array[i][j] > 0:
                items_users_saw[users_names[i]].append(items_names[j])
                items_users_saw_scores[users_names[i]].append([items_names[j], data_array[i][j]])
                count += 1
                sum += data_array[i][j]

        if count == 0:
            users_average_scores_list.append(0)
        else:
            users_average_scores_list.append(sum / count)

    for i in range(len(users_names)):

        users_profiles[users_names[i]] = {}

        for j in range(len(labels_names)):
            count = 0
            score = 0.0

            for item in items_users_saw_scores[users_names[i]]:

                if items_profiles[item[0]][labels_names[j]] > 0:
                    score += (item[1] - users_average_scores_list[i])
                    count += 1

            if abs(score) < 1e-6:
                score = 0.0
            if count == 0:
                result = 0.0
            else:
                result = score / count
            users_profiles[users_names[i]][labels_names[j]] = result
    return (users_profiles, items_users_saw)

def createItemsProfiles(data_array, labels_names, items_names):

    items_profiles = {}

    for i in range(len(items_names)):

        items_profiles[items_names[i]] = {}

        for j in range(len(labels_names)):
            items_profiles[items_names[i]][labels_names[j]] = data_array[i][j]

    return items_profiles
def calCosDistance(user, item, labels_names):

    sigma_ui = 0.0
    sigma_u = 0.0
    sigma_i = 0.0

    for label in labels_names:
        sigma_ui += user[label] * item[label]
        sigma_u += (user[label] * user[label])
        sigma_i += (item[label] * item[label])

    if sigma_u == 0.0 or sigma_i == 0.0:  # 若分母为0，相似度为0
        return 0

    return sigma_ui/math.sqrt(sigma_u * sigma_i)


def contentBased(user_profile, items_profiles, items_names, labels_names, items_user_saw):
    recommend_items = []

    for i in range(len(items_names)):
        if items_names[i] not in items_user_saw:
            recommend_items.append([items_names[i], calCosDistance(user_profile, items_profiles[items_names[i]], labels_names)])
    recommend_items.sort(key=lambda item: item[1], reverse=True)

    return recommend_items

def printRecommendedItems(recommend_items_sorted, max_num):
    count = 0
    for item, degree in recommend_items_sorted:
        print("节目名：%s， 推荐指数：%f" % (item, degree))
        count += 1
        if count == max_num:
            break

if __name__ == '__main__':
    all_users_names = ['3','13','23']
    all_labels = ['剧情', '西部', '家庭', '惊悚', '动画',
                  '爱情', '情色', '运动', '音乐', '灾难',
                  '悬疑', '儿童', '短片', '历史', '动作',
                  '科幻', '传记', '同性', '冒险', '歌舞',
                  '脱口秀', '真人秀', '新闻', '恐怖', '奇幻',
                  '犯罪', '喜剧', '纪录片', '战争', '古装',
                  '武侠', '综艺' ,'电视剧', '邵氏','电影']
    labels_num = len(all_labels)

    df1 = pd.read_csv('./temp_user_scores_mat.csv',sep=',',encoding='gbk',header='infer',error_bad_lines=False)
    (m1 , n1) = df1.shape
    data_array1 = np.array(df1.iloc[:m1+1 , 1:])
    items_users_saw_names1 = df1.columns[1:].tolist()

    df2 = pd.read_csv('./temp_users_movies_01mat.csv',sep=',',encoding='gbk',header='infer',error_bad_lines=False)
    (m2 , n2) = df2.shape
    data_array2 = np.array(df2.iloc[:m2 + 1, 1:])
    items_users_saw_names2 = np.array(df2.iloc[:m2 + 1, 0]).tolist()

    items_users_saw_profiles = createItemsProfiles(data_array2, all_labels, items_users_saw_names2)

    (users_profiles, items_users_saw) = createUsersProfiles(data_array1, all_users_names, items_users_saw_names1, all_labels, items_users_saw_profiles)


    df3 = pd.read_csv('./temp_movies_01mat.csv',sep=',',encoding='gbk',header='infer',error_bad_lines=False)
    (m3 , n3) = df3.shape
    data_array3 = np.array(df3.iloc[:m3+1, 1:])
    items_to_be_recommended_names = np.array(df3.iloc[:m3 + 1, 0]).tolist()

    items_to_be_recommended_profiles = createItemsProfiles(data_array3, all_labels, items_to_be_recommended_names)

    for user in all_users_names:
        print("给用户id为 %s 的推荐节目如下：" % user)
        recommend_items = contentBased(users_profiles[user], items_to_be_recommended_profiles, items_to_be_recommended_names, all_labels, items_users_saw[user])
        printRecommendedItems(recommend_items, 5)
        print('该用户推荐任务完成。')
        print( )
