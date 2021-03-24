package com.imooc.Java.CollectionMapUse.Set.SetCase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/5 22:17
 * @注释： HashSet使用示例
 */
public class Test {

    public static void Print(Set<Cat> set) {
        /**
         * Iterator(迭代器)接口可以以统一的方式对各种集合元素进行遍历
         * hasNext()方法检测集合中是否还有下一个元素
         * next()方法返回集合中的下一个元素
         */
        Iterator<Cat> it = set.iterator();
        // 遍历迭代器并输出元素
        while (it.hasNext()) {
            System.out.println(it.next() + "   ");
        }
        System.out.println();
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        // 定义宠物猫属性
        Cat cat1 = new Cat("花花", 2, "英短");
        Cat cat2 = new Cat("帆帆", 5, "中华田园");
//        Cat cat4 = new Cat("帆帆", 5, "中华田园");

        // <Cat>泛型，只能添加cat类型的数据
        Set<Cat> set = new HashSet<>();
//        set.add(cat4);
        set.add(cat1);
        set.add(cat2);

        /**
         * 此时输出的是“com.imooc.Java.CollectionMapUse.SetCase.Cat@677327b6”类的名字@保存地址
         *  System.out.println(xx)，括号里面的“xx”如果不是String类型的话，就自动调用xx的toString()方法
         * 需要重写println中的toString方法，转换成字符串
         */
        Print(set);

        // 再添加一个与花花属性相同的猫
        Cat cat3 = new Cat("花花", 2, "英短");
        set.add(cat3);
        System.out.println("添加重复数据");
        Print(set);
        /**
         *  显示重复数据，之前为什么不可以添加重复字符串数据
         *  现在是自己定义类，所以还需要在Cat方法中重写hashCode和equals方法
         */

        // 添加信息
        System.out.println("添加一只新的猫之后");
        Cat cat4 = new Cat("花花01", 2, "英短");
        set.add(cat4);
        Print(set);

        // 查找信息
        // 使用对象查找
        Search search = new Search();
        search.Search(set, cat1);

        // 使用名字查找
        search.Search(set, "花花");

        // 删除花花01的信息
        // 使用增强for循环
        // 报错：Exception in thread "main" java.util.ConcurrentModificationException
//        for (Cat cat : set) {
//            if(cat.getName().equals("花花01")){
//                set.remove(cat);
//            }
//        }
        System.out.println("删除花花01");
        Delete delete = new Delete(set);
        Print(set);

        System.out.println("删除全部");
        delete.Delete(set);
        Print(set);
    }
}
