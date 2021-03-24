package com.imooc.Java.CollectionMapUse.Sorting.ObjectComparatorSorting;

import java.util.Comparator;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 20:11
 * @注释： 年龄比较器
 */
public class YearSorting implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        int cat1 = o1.getMonth();
        int cat2 = o2.getMonth();
        int n = cat1 - cat2;
        return n;
    }
}
