package com.imooc.Java.work.work3;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/16 16:34
 * @注释：
 */
public class Code {
    static {
        System.out.println("Code的静态代码块");
    }

    {
        System.out.println("Code的构造块");
    }

    public Code(){
        System.out.println("Code的构造方法");
    }
}
