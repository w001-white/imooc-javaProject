package com.imooc.Java.CollectionMapUse.Sorting.ObjectComparatorSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 20:04
 * @注释： 对象类型排序Comparator
 * 强行对某个对象进行整体排序的比较函数。
 * 可以将Comparator传递给sort方法（如Collections.sort或Arrays.sort )
 */
public class ObjectSorting {
    public static void main(String[] args) {
        /**
         * int compare(T o1,T o2)比较用来排序的两个参数。
         * 如果o1<o2，返回负整数
         * 如果o1==o2，返回0
         * 如果o1>o2，返回正整数
         */

        Cat cat1 = new Cat("花花", 2, "英短");
        Cat cat2 = new Cat("帆帆", 5, "中华田园");
        Cat cat3 = new Cat("奥奥", 3, "英短");
        List<Cat> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);

        System.out.println("排序前：");
        for (Cat cat : list) {
            System.out.println(cat);
        }

        // 按名字顺序排序
        System.out.println("按名字顺序排序");
        //  选择带有comparator的sort方法，第一个参数是需要排序的对象，第二个参数是排序的规则，声明按姓名排序的方法
        Collections.sort(list, new NameSorting());
        for (Cat cat : list) {
            System.out.println(cat);
        }

        // 按年龄排序
        System.out.println("按年龄顺序排序");
        Collections.sort(list, new YearSorting());
        for (Cat cat : list) {
            System.out.println(cat);
        }
    }
}
