package com.imooc.Java.ThreadUse.ThreadRunUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 11:41
 * @注释： 线程创建方法一：多线程，run方法的应用
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("主线程1");

        // 与调用方法不同之处是，此时有两个线程在运行，一个是main的线程，一个是myThread的线程
        MyThread myThread = new MyThread();
        // 启动线程，不是调用MyThread的run方法，而是使用start方法
        myThread.start();
        /**
         * 报错：java.lang.IllegalThreadStateException
         * 一个线程只能启动一次
         */
//        myThread.start();

//        System.out.println("主线程2");
    }
}
