package com.imooc.Java.WrapUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/27 22:18
 * @注释： 装箱，即为把基本数据类型转换为其包装类;而拆箱，则是将包装类转换为基本数据类型。
 */
public class Wrap {
    public static void main(String[] args) {
        // 装箱：把基本数据类型转换为包装类
        // 1、自动装箱
        int t1 = 1;
        Integer t2 = t1;
        // 2、手动装箱
        Integer t3 = new Integer(t1);
        // 测试
        System.out.println("int类型变量t1=" + t1);
        System.out.println("Integer类型对象t2=" + t2);
        System.out.println("Integer类型对象t3=" + t3);
        System.out.println("===================");

        // 拆箱：把包装类转换成基本数据类型
        // 1、自动拆箱
        int t4 = t2;
        // 2、手动拆箱
        int t5 = t2.intValue();

        System.out.println("Integer类型对象t2=" + t2);
        System.out.println("自动拆箱后t4的值=" + t4);
        System.out.println("手动拆箱后t5的值=" + t5);
    }
}
