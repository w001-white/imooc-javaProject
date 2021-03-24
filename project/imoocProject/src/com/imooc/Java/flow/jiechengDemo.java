package com.imooc.Java.flow;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/12/30 16:43
 * 1到10的阶乘之和
 * 运行debug调试代码，一步一步执行程序，F9是继续执行
 */
public class jiechengDemo {
    public static void main(String[] args) {
        // 存储阶乘
        int jiecheng = 1;
        // 存储阶乘之和
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            jiecheng = 1;
            for(int j = 1; j <= i; j++){
                jiecheng = jiecheng * j;
            }
            sum = sum + jiecheng;
        }
        System.out.println(sum);
    }
}
