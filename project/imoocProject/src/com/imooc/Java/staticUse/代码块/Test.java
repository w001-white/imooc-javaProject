package com.imooc.Java.staticUse.代码块;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/12 18:56
 * @注释： 静态代码块，代码块执行以及静态变量的使用
 */
public class Test {
    // 1、静态变量的调用
    // 2、代码块：在存在多个对象时，静态代码块只被执行一次，而构造方法和构造代码块需要被多次执行
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("花花");
        // static的调用方法：1、对象.成员变量，2、类.成员变量
        cat.price = 200;
        Cat.price = 300;

//        Cat cat1 = new Cat();
//        cat1.setName("喵喵");
//        cat1.price = 100;

        System.out.println(cat.getName() + "的售价" + cat.price);
//        System.out.println(cat1.getName() + "的售价" + cat1.price);

        System.out.println("----------------");
        Cat cat1 = new Cat();

    }
}
