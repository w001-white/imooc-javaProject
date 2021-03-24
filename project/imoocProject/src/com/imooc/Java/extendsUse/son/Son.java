package com.imooc.Java.extendsUse.son;

import com.imooc.Java.extendsUse.father.Father;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 23:43
 * @注释：
 */
public class Son extends Father {
    public static int fa =110;
    private static int saa =100;

    static{
        System.out.println("我是子类的静态代码块");
    }
    {
        System.out.println("我是子类的普通代码块");
    }

    public Son(){
        System.out.println("我是子类的无参构造方法");
    }
    public int son(){
        return fa;
    }
}
