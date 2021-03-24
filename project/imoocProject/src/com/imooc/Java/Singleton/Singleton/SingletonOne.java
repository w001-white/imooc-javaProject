package com.imooc.Java.Singleton.Singleton;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 10:40
 * @注释： 饿汉式：创建对象实例的时候直接初始化,空间换时间
 * 所谓单例模式只能有一个对象，是指无论应用该类型产生多少对象，都是指向唯一的堆空间，所以测试类中，只是声明了两个对象的引用指向了同一内存空间，不会报错。
 */
public class SingletonOne {
    // 1、创建类中私有构造
    private SingletonOne(){

    }

    // 2、创建该类型的私有静态实例
    private static SingletonOne instance = new SingletonOne();

    // 3、创建公有静态方法返回静态实例对象
    public static SingletonOne getInstance(){
        return instance;
    }
}
