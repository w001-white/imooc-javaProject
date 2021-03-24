package com.imooc.Java.ThreadUse.synchronization.case2;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 8:21
 * @注释： 生产者
 */
public class Producer implements Runnable{
    Queue queue;
    public Producer(Queue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            // 每隔一段时间生产一件产品
                queue.setN(i++);
            // 模拟生产时间
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
