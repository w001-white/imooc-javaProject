package com.imooc.Java.ThreadUse.ThreadRunWork;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 11:43
 * @注释：
 */
public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 9; i++) {
            System.out.println("打印机正在打印" + (i + 1));
        }

    }
}
