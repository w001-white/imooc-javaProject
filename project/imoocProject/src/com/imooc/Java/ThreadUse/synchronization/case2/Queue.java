package com.imooc.Java.ThreadUse.synchronization.case2;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 8:16
 * @注释：
 */
public class Queue {
    private int n;
    boolean flag = false;

    public Queue() {

    }

    public synchronized int getN() {
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("销售：" + n);
        // 销售完毕，容器中没有数据
        flag = false;
        // 唤醒全部线程
        notifyAll();
        return n;
    }

    public synchronized void setN(int n) {
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产：" + n);
        this.n = n;
        // 生产完毕，容器中存在数据
        flag = true;
        notifyAll();
    }
}
