package com.imooc.Java.ThreadUse.ThreadRunnableUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 12:15
 * @注释：
 */
public class PrintRunnable implements Runnable {
    @Override
    public void run() {
        // 因为此时不是继承Thread类，所以getName方法不能使用
        // hread.currentThread()表示当前线程
        int i = 1;
        while (i < 10) {
            System.out.println(Thread.currentThread().getName() + "正在运行" + i);
            i++;
        }

    }
}
