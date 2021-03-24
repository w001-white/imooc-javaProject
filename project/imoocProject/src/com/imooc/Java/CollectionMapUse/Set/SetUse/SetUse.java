package com.imooc.Java.CollectionMapUse.Set.SetUse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/4 23:37
 * @注释： 将英文添加到HashSet中
 */
public class SetUse {

    public static void Print(Set set) {
        System.out.println("显示集合中的元素：");
        /**
         * Iterator(迭代器)接口统一的方式对各种集合元素进行遍历
         * hasNext()方法检测集合中是否还有下一个元素
         * next()方口可以以法返回集合中的下一个元素
         */
        Iterator it = set.iterator();
        // 遍历迭代器并输出元素
        while (it.hasNext()) {
            System.out.print(it.next() + "   ");
        }
        System.out.println();
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");

        Print(set);

        // 插入
        set.add("gree");

        // set中不能存在重复值,当插入重复值时，插入失败，相当于无效代码，但不会报错
        set.add("gree");
        Print(set);
    }
}
