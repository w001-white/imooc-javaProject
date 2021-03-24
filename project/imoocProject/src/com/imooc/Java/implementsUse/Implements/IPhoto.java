package com.imooc.Java.implementsUse.Implements;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 11:04
 * @注释： 具有照相能力的接口
 */
public interface IPhoto {
    public static final int TEMP = 30;
    public void photo();

    default void connection() {
        System.out.println("我是IPhoto接口中的默认链接connection");
    }

}
