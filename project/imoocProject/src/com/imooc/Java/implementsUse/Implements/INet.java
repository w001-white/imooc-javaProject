package com.imooc.Java.implementsUse.Implements;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 11:11
 * @注释： 具有上网功能的接口，接口访问修饰符：public、默认
 */
public interface INet {
    /**
     * 接口中抽象方法可以不写abstract关键字
     * 访问修饰符默认的是public
     * 当类实现接口时，需要去实现接口中的所有抽象方法，否则需要将该类设置为抽象类
     */

    public void net();


    // 接口中可以定义常量量，默认public static final，因此可以删去
    // 访问接口常量可以使用：接口.常量名
    // 默认访问修饰符是: public static final这三个任意缺省都不影响应用
    public static final int TEMP = 20;
    int month = 1;

    // default：默认方法，带方法体，实现接口时可以不用重写
    // 可以在实现类中重写与重载，并可以通过接口的引用调用,重写时需去掉default关键字，重载的方法无法通过接口引用访问
    // 调用接口中的方法:INet.super.connection();
    default void connection() {
        System.out.println("我是INet接口中的默认链接connection");
    }

    // static：静态方法，带方法体，实现接口时可以不用重写
    // 不可以在实现类中重写，可以同接口名调用
    static void stop(){
        System.out.println("我是接口中的静态方法");
    }
}
