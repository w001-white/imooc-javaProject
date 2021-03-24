package com.imooc.Java.ExceptionUse.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 23:42
 * @注释： 接收用户输入数字，输出两数之商
 * try-catch-finally搭配，try必须存在，catch-finally可只存在一种，可以存在多个catch，finally只能存在一个，处理范围大的异常放在后边
 * 运行顺序:try捕捉到异常之后，交给catch处理异常，最后执行finally，通常情况下finally都需要执行，除非在catch语句中输入System.exit(1);
 */
public class ExceptionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("运算开始");
        try {
            System.out.print("输入第一个数字：");
            int one = scanner.nextInt();
            System.out.print("输入第二个数字：");
            int two = scanner.nextInt();
            System.out.println("两数之商：" + one / two);
        } catch (ArithmeticException e) {
            // 方法表示终止当前运行的Java虚拟机。其中，参数作为状态代码。按照惯例，非零状态码表示异常终止。
            System.exit(1);// 终止程序运行
            e.printStackTrace();
            System.out.println("除数不可以为0");
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("请输入整数");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出错了");
        } finally {
            System.out.println("我一定会回来的");
        }

    }
}
