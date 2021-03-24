package com.imooc.Java.work.work1_4_2_3_2.Earth;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 19:34
 * @注释： 饿汉式练习
 */
public class Earth {
    // 1、创建类中私有构造
    private Earth() {
        System.out.println("地球诞生");
    }

    // 2、创建该类型的私有静态实例
    private static Earth earth = new Earth();

    // 3、创建公有静态方法返回静态实例对象
    public static Earth getEarth(){
        return earth;
    }
}
