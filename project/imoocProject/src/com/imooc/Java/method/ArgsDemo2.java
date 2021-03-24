package com.imooc.Java.method;

/**
 * @Author 旺
 * @Date 2021/1/5 18:08
 * @version 1.0
 * 注释：关于可变列表和重载的问题
 */
public class ArgsDemo2 {
    // 可变参数列表是最后一种执行
    public int sum(int... n){
        int sum = 0;
        for (int i : n){
            sum +=i;
        }
        System.out.println("执行可变参数方法");
        return sum;
    }

    public int sum(int a, int b){
        System.out.println("执行不可变参数方法");
        return a+b;
    }

    public static void main(String[] args) {
        ArgsDemo2 sum = new ArgsDemo2();
        sum.sum(1,2);
    }
}
