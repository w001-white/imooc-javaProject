package com.imooc.Java.work.work3;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/16 16:33
 * @注释：
 */
public class work2_14 {
    static {
        System.out.println("CodeBlock的静态代码块");

    }

    {
        System.out.println("CodeBlock的构造块");
    }

    public work2_14(){
        System.out.println("CodeBlock的构造方法");
    }

    public static void main(String[] args) {
        System.out.println("CodeBlock的主方法");
        System.out.println("产生Code类实例对象");
        Code code = new Code();
        System.out.println("产生CodeBlock类实例对象");
        work2_14 work214 = new work2_14();

    }
}
