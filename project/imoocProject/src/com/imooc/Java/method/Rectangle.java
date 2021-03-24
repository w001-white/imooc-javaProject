package com.imooc.Java.method;

import java.util.Scanner;

/**
 * @Author 旺
 * @Date 2021/1/4 22:06
 * 注释：调用方法，计算长方形的面积
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长方形的长：");
        int a = sc.nextInt();
        System.out.print("请输入长方形的宽：");
        int b = sc.nextInt();

        area area = new area();
        int s = area.area(a,b);
        System.out.println(s);
    }
}
