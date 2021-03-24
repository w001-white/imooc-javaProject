package com.imooc.Java.CollectionMapUse.work;

import java.util.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/8 14:37
 * @注释： 学校类
 */
public class School {
    /**
     * <班级，学生>
     * 班级中包含班级id、名字，以及学生的信息
     * 一个key只能对应一个value，所以value设置成班级集合
     */
    private Map<String, BanJi> schoolMap = null;

    public School() {
        schoolMap = new HashMap<>();
    }

    public Map<String, BanJi> getSchoolMap() {
        return schoolMap;
    }

    public void setSchoolMap(Map<String, BanJi> schoolMap) {
        this.schoolMap = schoolMap;
    }

    /**
     * 添加班级
     * @param banJi 班级
     */
    public void addBanJi(BanJi banJi) {
        schoolMap.put(banJi.getClassName(), banJi);
        System.out.println("班级添加成功");
    }

    /**
     * 删除班级
     * @param banJi 班级
     */
    public void deleteBanji(BanJi banJi) {
        schoolMap.remove(banJi.getClassName());
        System.out.println("班级删除成功");
    }

    /**
     * 通过班级名称查询班级
     * @param className 班级名称
     * @return BanJi
     */
    public BanJi searchByName(String className) {
        BanJi banJi = null;
        Set<String> list = schoolMap.keySet();
        for (String s : list) {
            if (s.equals(className)) {
                banJi = schoolMap.get(s);
                break;
            }
        }
        return banJi;
    }

    /**
     * 对各班语文成绩按平均分进行由大到小排序
     * 使用TreeMap排序
     */
    public void sortChineseByAverage() {
        Set<String> set = schoolMap.keySet();
        // 总成绩
        float sum = 0;
        // 循环遍历班级里边学生成绩
        int i = 0;
        // 排名
        int num = 1;
        Map<Float, String> m = new TreeMap<>(new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return (int) (o2 - o1);
            }
        });
        for (String s : set) {
            for (; i < schoolMap.get(s).getStudendList().size(); i++) {
                sum = schoolMap.get(s).getStudendList().get(i).getChinese();
            }
//            System.out.println(sum/i+schoolMap.get(s).getClassName());
            m.put(sum / i, schoolMap.get(s).getClassName());
        }
        for (String ss : m.values()) {
            System.out.println("语文平均成绩第" + num + "名：" + ss);
            num++;
        }
    }

    /**
     * 对各班数学成绩按平均分进行由大到小排序
     * 使用HashMap排序
     */
    public void sortMathByAverage() {
        // value为BanJi类（编号、名称、学生集合）
        // key为班级名称
        Set<String> set = schoolMap.keySet();
//        for (String s : set){
//            System.out.println(s);
//        }
        // 数学总成绩
        float sum = 0f;
        // 循环遍历班级里边学生成绩
        int i = 0;
        // 排名
        int num = 1;
        Map<Float, String> map = new HashMap<>();
        for (String s : set) {
            for (; i < schoolMap.get(s).getStudendList().size(); i++) {
                Student student = schoolMap.get(s).getStudendList().get(i);
                sum = sum + student.getMath();
            }
//            System.out.println((sum/i)+schoolMap.get(s).getClassName());
            map.put(sum / i, schoolMap.get(s).getClassName());
        }
        //使用链表来对集合进行排序，使用LinkedList，利于插入元素
        List<Map.Entry<Float, String>> list = new ArrayList<>(map.entrySet());
        //自定义比较器来比较链表中的元素
        Collections.sort(list, new Comparator<Map.Entry<Float, String>>() {
            @Override
            public int compare(Map.Entry<Float, String> o1, Map.Entry<Float, String> o2) {
                return (int) (o2.getKey() - o1.getKey());
            }
        });

        //将排好序的存入到LinkedHashMap(可保持顺序)中，需要存储键和值信息对到新的映射中。
        Map<Float, String> linkMap = new LinkedHashMap<>();
        for (Map.Entry<Float, String> newEntry : list) {
            linkMap.put(newEntry.getKey(), newEntry.getValue());
        }
        //根据entrySet()方法遍历linkMap
//        for (Map.Entry<Float, String> mapEntry : linkMap.entrySet()) {
//            System.out.println("语文平均成绩第" + num + "名：" + mapEntry.getValue());
//            num++;
//        }

        for (float ss : linkMap.keySet()) {
            System.out.println("语文平均成绩第" + num + "名：" + linkMap.get(ss));
            num++;
        }
    }

    /**
     * 显示所有班级名称
     */
    public void displayBanJiName() {
        for (String s : schoolMap.keySet()){
            System.out.println(s);
        }
    }
}
