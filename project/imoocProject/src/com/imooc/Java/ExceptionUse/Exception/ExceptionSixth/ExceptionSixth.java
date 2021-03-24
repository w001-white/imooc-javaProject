package com.imooc.Java.ExceptionUse.Exception.ExceptionSixth;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/27 0:45
 * @注释： 异常链
 */
public class ExceptionSixth {
    public static void main(String[] args) {
        try {
            text3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void text1() throws HotelAgeException {
        throw new HotelAgeException();
    }

    public static void text2()  {
        try {
            text1();
        } catch (HotelAgeException e) {
            // 显示上一个异常
            try {
                throw new Exception("我是新异常1", e);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
//            throw new Exception("我是新异常1");
        }
    }

    public static void text3() throws Exception {
        try {
            text2();
        } catch (Exception e) {
            Exception e1 = new Exception("我是新异常2");
            e1.initCause(e);
            throw e1;
//            throw new Exception("我是新异常2",e);
        }
    }
}
