package com.imooc.Java.privateUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/11 17:37
 * @注释：
 */
public class privateUse002 {

    private int add(int a, int b){
        return a+b;
    }

    private int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        privateUse002 privateUse002 = new privateUse002();
        System.out.println(privateUse002.add(1,2) + privateUse002.add(3,4,5));
    }
}
