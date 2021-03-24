package com.imooc.Java.CollectionMapUse.Sorting.TreeSetSorting;

import java.util.TreeSet;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 0:29
 * @注释： TreeSet
 */
public class TreeSetSorting {
    public static void main(String[] args) {
        // 字符串比较
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("C++");
        treeSet1.add("Java");
        treeSet1.add("Python");
        treeSet1.add("Go");

        for (String treeSet : treeSet1) {
            System.out.print(treeSet + "  ");
        }

        System.out.println();
        // 返回集合中第一个元素,默认按升序排序最小的元素
        System.out.println("集合中第一个元素:" + treeSet1.first());
        // 返回集合中最后一个元素,默认按升序排序最大的元素
        System.out.println("集合中第一个元素:" + treeSet1.last());

        // 整型数字比较
        System.out.println("===========================");
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(10);
        treeSet2.add(2);
        treeSet2.add(20);
        treeSet2.add(-8);
        // 循环输出
        System.out.println(treeSet2);
        // 集合中小于或等于给定元素的最大的元素，如果没有则返回null
        System.out.println("等于该元素的情况：" + treeSet2.floor(20));
        System.out.println("小于该元素的情况：" + treeSet2.floor(10));
        System.out.println("不符合该元素的情况：" + treeSet2.floor(-20));

        // 集合中大于给定元素的最小的元素，如果没有则返回null
        System.out.println("大于该元素的情况：" + treeSet2.higher(10));
        System.out.println("大于该元素的情况：" + treeSet2.higher(1));
        System.out.println("不存在该元素的情况：" + treeSet2.higher(100));
    }
}
