package com.imooc.Java.CollectionMapUse.Sorting.TreeSetSorting.TreeSetObjectSorting;

import java.util.TreeSet;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 0:42
 * @注释： TreeSet进行自定义对象排序
 */
public class Test {
    public static void main(String[] args) {
        People people1 = new People("aa", 102);
        People people2 = new People("bb", 121);
        People people3 = new People("cc", 120);
        People people4 = new People("dd", 128);
        People people5 = new People("ee", 132);

        TreeSet<People> treeSet = new TreeSet<>(new PeopleComparator());
        treeSet.add(people1);
        treeSet.add(people2);
        treeSet.add(people3);
        treeSet.add(people4);
        treeSet.add(people5);

        for (People people : treeSet){
            System.out.println(people);
        }

        System.out.println("===================");
        System.out.println("检测并删除第一个元素");
        // pollFirst()检索并删除集合第一个元素，如果集合为空则返回null
        System.out.println(treeSet.pollFirst());

        System.out.println("===================");
        for (People people : treeSet){
            System.out.println(people);
        }

        System.out.println("===================");
        System.out.println("检测并删除最后一个元素");
        // pollLast()检索并删除集合最后一个元素，如果集合为空则返回null
        System.out.println(treeSet.pollLast());

        System.out.println("===================");
        for (People people : treeSet){
            System.out.println(people);
        }
    }
}
