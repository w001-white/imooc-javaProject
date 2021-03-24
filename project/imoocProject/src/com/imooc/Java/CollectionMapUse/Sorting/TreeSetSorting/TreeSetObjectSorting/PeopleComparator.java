package com.imooc.Java.CollectionMapUse.Sorting.TreeSetSorting.TreeSetObjectSorting;

import java.util.Comparator;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 0:42
 * @注释：
 */
public class PeopleComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
//        int people1 = o1.arg;
//        int people2 = o2.arg;
//        int n = people1 - people2;
//        return n;
        return o1.arg - o2.arg;
    }
}
