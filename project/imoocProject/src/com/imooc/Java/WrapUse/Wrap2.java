package com.imooc.Java.WrapUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/28 21:28
 * @注释： 基本数据类型转换为字符串
 */
public class Wrap2 {
    public static void main(String[] args) {
        int t1 = 2;
        String s1 = Integer.toString(t1);
        System.out.println("int类型转换为String类型对象七2=" + s1);
        System.out.println("=============================");

        // 字符串转换为基本数据类型
        // 1、包装类的parse
        int t2 = Integer.parseInt(s1);
        System.out.println(t2);
        // 2、包装类的valueOf先将字符串转换为包装类，再通过自动拆箱完成基本类型转换
        int t4 = Integer.valueOf(s1);
        System.out.println(t4);

    }
}
