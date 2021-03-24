package com.imooc.Java.ThreadUse.ThreadRunCase;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 11:41
 * @注释： 线程运行随机
 */
public class Test {
    public static void main(String[] args) {
        // 线程运行随机，获取cpu的使用权随机
        MyThread myThread1 = new MyThread("线程1");
        MyThread myThread2 = new MyThread("线程2");
        myThread1.start();
        myThread2.start();
    }
}
