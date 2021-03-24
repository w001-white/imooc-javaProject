package com.imooc.Java.array;

/**
 * @Author 旺
 * @Date 2021/1/4 20:03
 * 注释：增强型for循环
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println("增强型for循环：");
        for(int n : a){
            System.out.print(n + "   ");
        }
    }
}
