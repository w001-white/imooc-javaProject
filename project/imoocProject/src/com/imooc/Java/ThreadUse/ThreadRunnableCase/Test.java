package com.imooc.Java.ThreadUse.ThreadRunnableCase;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 12:08
 * @注释： run方法可以被多个线程共享
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 此时printRunnable被两个线程共享，此时适合多个线程处理同一个资源的情况
         * 此时thread和thread1一共运行10次，共同处理printRunnable对象
         * 与之前代码区别：
         *  1、run方法的自变量i放到方法外边做全局变量
         *  2、创建一个printRunnabl对象
         */
        PrintRunnable printRunnable = new PrintRunnable();
        Thread thread = new Thread(printRunnable);
        thread.start();

        Thread thread1 = new Thread(printRunnable);
        thread1.start();
    }
}
