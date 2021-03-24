package com.imooc.Java.ThreadUse.block.ThreadJoinUse.Case2;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 16:26
 * @注释：
 */
public class Test {
    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "正在运行" + i + "次");
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        // 抛出异常
        // 加入join之后，会使该线程抢先执行，调用join的线程执行结束后才会执行其它线程
        myThread.join();
        for (int i = 0; i < 10; i++){
            System.out.println("主线程运行结束" + "正在运行" + i + "次");
        }

    }
}
