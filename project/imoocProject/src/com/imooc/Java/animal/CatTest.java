package com.imooc.Java.animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/6 17:05
 * @注释：
 */
public class CatTest {
    public static void main(String[] args) {
        // 声明对象，是在栈中完成，开辟一片空间，但空间为null，什么都没有
        Cat cat;
        // 实例化队形，在堆中完成，在内存的堆空间内开辟一片空间，完成对象相关的初始化操作
        cat = new Cat();

        Cat cat1 = new Cat("qq", 2, 2.0, "英短");
        System.out.println("---------------");

        cat.run();
        cat.eat();
        // 成员变量调用时都会初始化，可以打印输出，但方法内部定义的变量不进行赋值，则无法输出
        System.out.println("昵称" + cat.name);
        System.out.println("年龄" + cat.month);
        System.out.println("体重" + cat.weight);
        System.out.println("品种" + cat.sort);
        System.out.println("---------------");

        // 对成员变量进行赋值
        cat.name = "花花";
        cat.month = 2;
        cat.weight = 1.2;
        cat.sort = "英短";
        System.out.println("昵称：" + cat.name);
        System.out.println("年龄：" + cat.month);
        System.out.println("体重：" + cat.weight);
        System.out.println("品种：" + cat.sort);
        System.out.println("---------------");

        cat.run(cat.name);
//        cat.Cat();
    }
}
