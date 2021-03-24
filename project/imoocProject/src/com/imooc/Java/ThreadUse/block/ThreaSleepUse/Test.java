package com.imooc.Java.ThreadUse.block.ThreaSleepUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 15:51
 * @注释：
 * public static void sleep(long millis)
 * 作用:在指定的毫秒数内让正在执行的线程休眠（暂停执行)
 * 参数为休眠的时间，单位是毫秒
 */
public class Test {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        Thread thread = new Thread(threadSleep);
        thread.start();

        Thread thread1 = new Thread(threadSleep);
        thread1.start();
    }
}
