package com.imooc.Java.ThreadUse.synchronization.case2;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 8:24
 * @注释： 销售
 */
public class Consumer implements Runnable{
    Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            queue.getN();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
