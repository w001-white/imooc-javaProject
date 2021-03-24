package com.imooc.Java.ThreadUse.synchronization.case1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 17:32
 * @注释：
 */
public class Bank {
    // 账号
    private String num;
    // 账户余额
    private int balance;

    public Bank() {

    }

    public Bank(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }

    // 存钱
    // synchronized同步，此线程结束之前,其它线程不能打断此线程
    public synchronized void saveAccount() {
        int balance = getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 修改账户余额+100
        balance += 100;
        // 修改账户余额
        setBalance(balance);
        // 输出余额
        System.out.println("存款后账户余额为：" + balance);
    }

    // 取钱
    public void drawAccount() throws InterruptedException {
        // 语句块，同步
        synchronized (this) {
            // 在不同位置添加睡眠，模拟真实场景
            // 获得当前账户余额
            int balance = getBalance();
            // 修改余额，取出200
            balance -= 200;

            Thread.sleep(1000);

            // 修改账户余额
            setBalance(balance);
            // 输出余额
            System.out.println("取款后账户余额为：" + balance);
        }

    }
}
