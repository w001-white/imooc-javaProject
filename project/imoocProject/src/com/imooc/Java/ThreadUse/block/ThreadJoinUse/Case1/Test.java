package com.imooc.Java.ThreadUse.block.ThreadJoinUse.Case1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 16:26
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        Join join = new Join();
        Thread thread = new Thread(join);
        thread.start();
        System.out.println("主线程运行结束");
    }
}
