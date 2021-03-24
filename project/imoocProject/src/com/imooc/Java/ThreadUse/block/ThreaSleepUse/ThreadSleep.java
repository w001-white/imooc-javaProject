package com.imooc.Java.ThreadUse.block.ThreaSleepUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 15:51
 * @注释：
 */
public class ThreadSleep implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(Thread.currentThread().getName() + "执行第" + (i + 1) + "次");
            i++;

            /**
             * 捕获异常的原因：在sleep期间，若是打断该休眠时，就会产生异常，需要捕获
             * 睡眠时间1s
             */
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
