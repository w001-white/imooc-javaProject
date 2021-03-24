package com.imooc.Java.CollectionMapUse.Sorting.ListSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 20:00
 * @注释： Collections类中包含对list的整型和字符型的排序方法sort()；
 */
public class ListSorting {
    public static void main(String[] args) {
        // 整型排序
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(9);
        list1.add(5);
        for (int s : list1){
            System.out.print(s+"   ");
        }

        System.out.println();
        Collections.sort(list1);
        for (int s : list1){
            System.out.print(s+"   ");
        }

        // 字符串排序
        System.out.println();
        List<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("tomato");
        list.add("apple");
        list.add("litchi");
        list.add("banana");
        for (String s : list){
            System.out.print(s+"   ");
        }

        System.out.println();
        Collections.sort(list);
        for (String s : list){
            System.out.print(s+"   ");
        }
    }
}
