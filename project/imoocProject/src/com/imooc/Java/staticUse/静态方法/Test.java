package com.imooc.Java.staticUse.静态方法;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/15 23:06
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        // 1、类外可应用"类名.成员方法"或"对象名.成员方法"的方式访问非私有静态方法
        // 2、应用"对象名.成员方法"时会出现警告，但不影响程序运行。
        // 类外静态方法访问方式1:类名.成员方法
        CarDemo.firm = "一汽大众";
        CarDemo.display();

        System.out.println("----------");
        //类外静态方法访问方式2:对象名.成员方法
        CarDemo carDemo = new CarDemo("红色");
        carDemo.display();

        System.out.println("----------");
        carDemo.run();
    }


}
