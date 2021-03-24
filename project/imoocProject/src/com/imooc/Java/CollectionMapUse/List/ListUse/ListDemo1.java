package com.imooc.Java.CollectionMapUse.List.ListUse;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/4 11:02
 * @注释： 用ArrayList存储编程语言的名称，并输出
 */
public class ListDemo1 {

    public static void Print(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        List list = new ArrayList();
        list.add("java");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("swift");

        // 输出列表中元素的个数
        System.out.println("输出列表中元素的个数:" + list.size());

        // 输出列表中所有元素
        System.out.print("显示原来的列表元素:");
        Print(list);
        System.out.println();

        // 移除列表中的某一元素，方法一：根据保存位置移除
        list.remove(2);
        System.out.print("移除后的列表元素为:");
        Print(list);
        System.out.println();

        // 方法二：根据要移除的内容
        list.remove("C");
        System.out.print("移除后的列表元素为:");
        Print(list);
    }
}
