package com.imooc.Java.Singleton.Test;

import com.imooc.Java.Singleton.Singleton.SingletonOne;
import com.imooc.Java.Singleton.Singleton.SingletonTwo;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 10:40
 * @注释： 单例模式：饿汉、懒汉
 */
public class Test {
    public static void main(String[] args) {
        // 调用的时候已经实例化
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one);
        System.out.println(two);
        System.out.println("==============================================");

        SingletonTwo one1 = SingletonTwo.getSingletonTwo();
        SingletonTwo two1 = SingletonTwo.getSingletonTwo();
        System.out.println(one1);
        System.out.println(two1);
    }
}
