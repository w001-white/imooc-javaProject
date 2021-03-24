package com.imooc.Java.method;

/**
 * @Author 旺
 * @Date 2021/1/4 22:20
 * 注释：调用方法，输出字符串
 */
public class ArrayMethod {

    public void printArray(int[] a){
        for(int i =0; i < a.length; i++)
            System.out.print(a[i] + "   ");
        System.out.println();
        for(int n:a)
            System.out.print(n + "   ");
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayMethod array = new ArrayMethod();
        array.printArray(a);
    }
}
