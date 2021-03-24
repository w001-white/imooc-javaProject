package com.imooc.Java.array;

import java.util.Scanner;

/**
 * @Author 旺
 * @Date 2021/1/4 19:04
 * 注释：
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i <a.length; i++){
            System.out.print("请输入第"+ (i+1) +"个数：");
            a[i] = sc.nextInt();
        }
        System.out.println();
        for(int i=0; i<a.length; i++){
            sum += a[i];
            System.out.println("数组a[" + i + "]为：" + a[i] + "   ");
        }
        System.out.println("数组中数字之和为" + sum);
    }
}
