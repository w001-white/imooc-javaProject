package com.imooc.Java.ThreadUse.block.ThreadJoinUse.Case3;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 16:38
 * @注释：
 */
public class Test2 {
    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "正在运行" + i + "次");
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        // 抛出异常
        // 加入join之后，会使该线程抢先执行
        // join（1），代表此线程无论执行到什么地步，1ms后都会去执行其它线程
        myThread.join(1);
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程运行结束" + "正在运行" + i + "次");
        }
    }
}
