package com.imooc.Java.ImplementExtendsUse.Implement;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 22:30
 * @注释：
 */
public interface IFather2 {
    void dunrk();
    default void connection(){
        System.out.println("我是IFather2中的connection");
    }
    static void connection1(){
        System.out.println("我是IFather2中的静态connection");
    }
}
