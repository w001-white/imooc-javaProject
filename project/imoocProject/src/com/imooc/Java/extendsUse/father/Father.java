package com.imooc.Java.extendsUse.father;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 23:43
 * @注释：
 */
public class Father {
    /**
     * 静态变量以及代码块加载顺序和其排列顺序有关
     */
    public static int fa =10;
    private static int faa =100;

    static{
        System.out.println("我是父类的静态代码块");
    }
    public Father(){
        System.out.println("我是父类的无参构造方法");
    }
    {
        System.out.println("我是父类的普通代码块");
    }


}
