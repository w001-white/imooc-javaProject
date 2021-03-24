package com.imooc.Java.work.work1_4_2_3_2.Test;

import com.imooc.Java.work.work1_4_2_3_2.Earth.Earth;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 19:34
 * @注释： 懒汉式练习
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("第一个地球创建中。。。");
        Earth earth = Earth.getEarth();
        System.out.println("第二个地球创建中。。。");
        Earth earth1 = Earth.getEarth();
        System.out.println("第三个地球创建中。。。");
        Earth earth2 = Earth.getEarth();
        System.out.println("问:三个地球是同一个么?\n");
        System.out.println(earth+"\n"+earth1+"\n"+earth2);
    }
}
