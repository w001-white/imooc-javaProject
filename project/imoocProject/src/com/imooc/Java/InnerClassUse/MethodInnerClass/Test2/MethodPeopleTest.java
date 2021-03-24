package com.imooc.Java.InnerClassUse.MethodInnerClass.Test2;

import com.imooc.Java.InnerClassUse.MethodInnerClass.People2.MethodPeople;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 23:24
 * @注释： 方法内部类
 */
public class MethodPeopleTest {
    public static void main(String[] args) {
        MethodPeople methodPeople = new MethodPeople();
        MethodPeople.age = 12;
        System.out.println(methodPeople.getHeart());
    }
}
