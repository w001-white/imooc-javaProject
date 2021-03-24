package com.imooc.Java.ExceptionUse.Exception;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/26 12:17
 * @注释： 如果方法返回值为void，则return后无需加返回值，直接分号结束;通过return返回值;可以结束当前方法执行将返回值带回调用处.
 * return语句可以分别出现在try、catch以及finally块中，但是由于finally语句块一定要执行，所以当存在finally时，
 * 会先执行完finally中的代码再执行return。
 */
public class ExceptionTwo {
    public static void main(String[] args) {
        int result = test();
        System.out.println(result);
    }

    public static int test() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("输入第一个数字：");
            int one = scanner.nextInt();
            System.out.print("输入第二个数字：");
            int two = scanner.nextInt();
            return one / two;
        } catch (ArithmeticException e) {
            System.out.println("除数不可以为0");
            return 0;
        } finally {
            System.out.println("我一定会回来的");
//            return 10;
        }
    }
}