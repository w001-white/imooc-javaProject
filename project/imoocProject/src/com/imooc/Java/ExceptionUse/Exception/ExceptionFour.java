package com.imooc.Java.ExceptionUse.Exception;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/26 23:55
 * @注释： throw
 */
public class ExceptionFour {
    public static void main(String[] args){
        test1();

        /**
         * 1、调用者自己处理，使用try-catch语句
         * 2、在main方法中加入throws Exception
         */
        try {
            test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * throw抛出异常对象的处理方案:
     * 1、通过try ..catch包含throw语句--自己抛自己处理
     */
    // 描述酒店的入住规则:限定年龄，18岁以下，80岁以上的住客必须由亲友陪同
    public static void test1() {
        try {
            System.out.print("请输入年龄：");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age < 18 || age > 80) {
                /**
                 * 如throw抛出的是CheckedException对象，且未进行任何处理，会编译报错;
                 * 如抛出的是UncheckedException对象，则默认不会产生错误提醒。
                 * 当然，更推荐大家进行处理操作，以避免后续不必要的失误。
                 */
//                throw new ArithmeticException();
                throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
            } else {
                System.out.println("欢迎入住酒店");
            }
        } catch (Exception e) {
            System.out.println("异常信息如下");
            e.printStackTrace();
        }
    }

    /**
     * 2、通过throws在方法声明出抛出异常类型--谁调用谁处理--调用者可以自己处理，也可以继续上抛
     * 此时可以抛出与throw对象相同的类型或者其父类(Throwable)
     * @throws Exception
     */
    public static void test2() throws Exception{
        System.out.print("请输入年龄：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18 || age > 80) {
            throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
            // 方法中，throw和return都会触发方法中断操作，因此在未加入判断的情况下，不可同时出现。
            // 当加入if伴断后，错误提示消失。
//            return;
        } else {
            System.out.println("欢迎入住酒店");
        }
    }
}
