package com.imooc.Java.method;

/**
 * @Author 旺
 * @Date 2021/1/5 17:46
 * 注释：可变参数列表
 */
public class ArgsDemo {
    //求和
    public void sum(int... n){
        int sum = 0;
        for (int i : n){
            sum +=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ArgsDemo sum = new ArgsDemo();
        sum.sum(1);
        sum.sum(1,2);
        sum.sum(1,2,3);
        System.out.println();
    }
}
