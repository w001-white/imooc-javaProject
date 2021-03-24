package com.imooc.Java.flow;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/12/30 16:31
 * 输出10行的直角三角形星号
 */
public class starDemo1 {
    public static void main(String[] args) {
        // 输入行数和列数
        int n = 10;
        // 输入行数
        int n1 = 1;
        // 输入列数
        int n2 =1;
        // 外层循环控制行数
        while(n1 <= n){
            // 内层循环决定列数
            while(n2 <= n1) {
                System.out.print("  *  ");
                n2++;
            }
            System.out.println();
            n2 = 1;
            n1++;
        }
    }
}
