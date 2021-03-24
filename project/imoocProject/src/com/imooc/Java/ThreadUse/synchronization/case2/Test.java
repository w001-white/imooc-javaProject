package com.imooc.Java.ThreadUse.synchronization.case2;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 8:16
 * @注释：
 * 线程同步：解决生产不足，不能消费
 * 线程通信，解决生产滞销问题，做到一生产一销售
 * wait():中断方法执行，使线程等待（容易造成死锁：生产者等待消费，同时消费者等待生产）
 * 解决死锁：
 * notify)方法∶唤醒处于等待的某一个线程，使其结束等待
 * notifyAll()方法∶唤醒所有处于等待的线程，使它们结束等待
 */
public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        /**
         * 创建生产者线程，并启动
         * 想当于：
         * Producer producer = new Producer(queue);
         * Thread thread = new Thread(producer);
         * thread.start();
         */
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
