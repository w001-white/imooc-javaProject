package com.imooc.Java.staticUse.代码块;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/12 18:55
 * @注释：
 */
public class Cat {
    private String name;
    // static: 静态成员、类成员；对于价格而言，所有对象是使用同一块空间
    // 从类第一次声明产生，直到这个类彻底销毁的时候才消失
    static int price;

    public Cat() {
        System.out.println("我是构造方法");
    }

    // 构造代码块：在类中定义，在创建对象的时候被调用，优先于构造方法，可多个创建
    {
        // 普通代码块可以给所有属性变量赋值
        name = "构造代码块";
        price = 10;
        System.out.println("我是构造代码块1");
    }

    // 静态代码块：在类中定义，在创建对象的时候被调用，优先于构造代码块和构造方法，可多个创建
    static {
        // 给静态变量赋值
        price = 11;
        // 给普通变量赋值
        Cat cat = new Cat();
        cat.name = "静态代码块";
        System.out.println("我是静态代码块");
    }

    public String getName() {
        // 普通代码块：在方法中定义，是顺序执行，可多个创建
        // 不同的代码块中可以定义相同名字的变量
        {
            int a =11;
            System.out.println("我是普通代码块1   a=" + a);
        }
        // 代码块中的变量只能作用与代码块之内，代码块中的变量随着代码块生成而生成，结束而结束
        // 可以通过重新定义变量a解决，但下边的变量a会报错，因为此处定义的a作用域是从此处作用到方法的结束，与代码块中的变量冲突
//        int a = 13;
//        System.out.println("在两个代码块之间的a=" + a);
        {
            int a = 12;
            System.out.println("我是普通代码块2   a=" + a);
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
