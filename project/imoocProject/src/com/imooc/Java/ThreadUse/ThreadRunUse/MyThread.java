package com.imooc.Java.ThreadUse.ThreadRunUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 11:43
 * @注释： 继承Thread之后（extends Thread）就是一个线程
 */
public class MyThread extends Thread {
    public void run() {
        // 获取线程的名字,因为此时继承Thread类，所以可以直接使用getName方法
        System.out.println(getName() + "该线程正在执行");
    }
}
