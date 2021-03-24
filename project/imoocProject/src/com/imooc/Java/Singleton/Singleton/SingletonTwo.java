package com.imooc.Java.Singleton.Singleton;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 11:31
 * @注释： 懒汉式：创建对象先不实例化，第一次调用get方法时才实例化,用时间换空间
 */
public class SingletonTwo {
    // 1、创建类中私有构造
    private SingletonTwo(){

    }

    // 2、创建静态的该类实例对象
    private static SingletonTwo singletonTwo = null;

    // 3、创建公有静态方法返回静态实例对象
    public static SingletonTwo getSingletonTwo(){
        if(singletonTwo == null)
            singletonTwo = new SingletonTwo();
        return singletonTwo;
    }
}
