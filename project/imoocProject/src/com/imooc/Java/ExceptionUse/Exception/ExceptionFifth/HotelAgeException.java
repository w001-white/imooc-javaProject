package com.imooc.Java.ExceptionUse.Exception.ExceptionFifth;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/27 0:30
 * @注释：
 */
public class HotelAgeException extends Exception{
    public HotelAgeException(){
        super("18岁以下，80岁以上的住客必须由亲友陪同");
    }

}
