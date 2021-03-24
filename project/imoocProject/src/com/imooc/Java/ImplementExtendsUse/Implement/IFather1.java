package com.imooc.Java.ImplementExtendsUse.Implement;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 22:30
 * @注释：
 */
public interface IFather1 {
    void eat();

    default void connection(){
        System.out.println("我是IFather1中的connection");
    }
}
