package com.imooc.Java.CollectionMapUse.Sorting.ObjectComparatorSorting;


import java.util.Comparator;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 20:10
 * @注释： 需要重新compare方法和equals方法，但是equals方法被Object中的方法覆盖掉，所以不需要重写
 */
public class NameSorting implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        // 按名字进行升序牌序
        String name1 = o1.getName();
        String name2 = o2.getName();
        // 和compare方法返回值规则一样
        // 升序排序
        int n = name1.compareTo(name2);
        // 降序排序，改变两个对象的位置
//        int n = name2.compareTo(name1);
        return n;
    }
}
