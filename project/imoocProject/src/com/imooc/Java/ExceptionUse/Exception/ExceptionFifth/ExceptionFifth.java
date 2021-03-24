package com.imooc.Java.ExceptionUse.Exception.ExceptionFifth;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/27 0:30
 * @注释： 自定义异常类
 */
public class ExceptionFifth {
    public static void main(String[] args) {
        try {
            test1();
        } catch (HotelAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("酒店前台不允许办理入住");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void test1() throws HotelAgeException {
        System.out.print("请输入年龄：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18 || age > 80) {
            throw new HotelAgeException();
        } else {
            System.out.println("欢迎入住酒店");
        }

    }
}
