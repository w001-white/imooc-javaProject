package com.imooc.Java.flow;

import java.util.Scanner;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/12/30 16:18
 * 猜数字
 */
public class GuessDemo {
    public static void main(String[] args) {
        // 待猜测数字
        // Math.random()返回[0，1）
        int n =(int)(Math.random() * 10 + 1);
        int number;
        do {
            System.out.println("请输入待猜测数字：");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            if(number > n)  System.out.println("太大了");
            if(number < n)  System.out.println("太小了");
        }while (n != number);
        System.out.println("恭喜你猜测正确，答案是：" + n);
    }
}
