package com.imooc.Java.ThreadUse.ThreadRunnableUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 12:08
 * @注释： 线程创建方法二：runnable接口
 * 使用此种方法原因：
 * 1、java不支持多继承（若此时该类已经继承一个类，就不能继承Thread类）
 * 2、不打算重写Thread类的其他方法
 */
public class Test {
    public static void main(String[] args) {
        // 第一步：定义runnable实现类的对象
        PrintRunnable printRunnable = new PrintRunnable();
        /**
         * 第二步：通过runnable创建线程类的对象
         * 此时没有start方法，因此使用Thread中其它方法
         */
        Thread thread = new Thread(printRunnable);
        // 第三步：启动线程
        thread.start();

        PrintRunnable printRunnable1 = new PrintRunnable();
        Thread thread1 = new Thread(printRunnable1);
        thread1.start();
    }
}
