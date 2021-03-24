package com.imooc.Java.ExceptionUse.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/26 20:35
 * @注释： throws
 */
public class ExceptionThree {
    public static void main(String[] args) {
        try {
            int result = test();
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("除数不可以为0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }
        test();
    }

    /**
     * 通过throws抛出异常时，针对可能出现的多种异常情况，解决方案:
     * 1、throws后面接多个异常类型，中间用逗号分隔
     * 2、throws后面接Exception
     */
    /**
     * @return 两个接受数据的商
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入第一个数字：");
        int one = scanner.nextInt();
        System.out.print("输入第二个数字：");
        int two = scanner.nextInt();
        return one / two;
    }
}
