package com.imooc.Java.ThreadUse.synchronization.case1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 22:34
 * @注释： 取款,取款的线程
 */
public class DrawAccount implements Runnable{
    Bank bank;
    public DrawAccount(Bank bank){
        this.bank=bank;
    }
    @Override
    public void run() {
        try {
            bank.drawAccount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
