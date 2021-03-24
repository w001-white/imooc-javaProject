package com.imooc.Java.ThreadUse.synchronization.case1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 22:28
 * @注释： 存款，存款的线程
 */
public class SaveAccount implements Runnable{
    Bank bank;
    public SaveAccount(Bank bank){
        this.bank=bank;
    }
    public void run(){
        bank.saveAccount();
    }
}

