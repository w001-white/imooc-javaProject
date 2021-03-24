package com.imooc.Java.ThreadUse.block.ThreadJoinUse.Case1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 16:26
 * @注释：
 */
public class Join implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在运行");
    }
}
