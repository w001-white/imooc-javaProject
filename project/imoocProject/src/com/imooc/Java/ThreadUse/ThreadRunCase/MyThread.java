package com.imooc.Java.ThreadUse.ThreadRunCase;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 11:43
 * @注释： 继承Thread之后（extends Thread）就是一个线程
 * 所有和线程相关的，都写到run方法中
 */
public class MyThread extends Thread {
    // 调用父类Thread，为线程指定一个名字
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        // 获取线程的名字
        for (int i = 0; i <= 10; i++) {
            System.out.println(getName() + "正在运行" + i);
        }
    }
}
