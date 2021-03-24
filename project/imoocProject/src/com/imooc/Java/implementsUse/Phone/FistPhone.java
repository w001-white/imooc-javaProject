package com.imooc.Java.implementsUse.Phone;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 10:42
 * @注释： 一代手机，继承手机功能，并新增功能，发短信
 */
public class FistPhone extends Phone{
    public FistPhone(){

    }

    public void message(){
        System.out.println("手机可以发短信");
    }
}
