package com.imooc.Java.InnerClassUse.MemberInnerClass.People1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 23:24
 * @注释：
 */

// 外部类
public class People {
    int age;

    public Heart getHeart() {
        return new Heart();
    }

    public void eat() {
        System.out.println(new Heart().temp + "人会吃东西：外部类");
    }

    /**
     * 成员内部类：
     * 1、内部类在外部使用时，无法直接实例化，需要借由外部类信息才能完成实例化
     * 2、内部类的访问修饰符，可以任意,但是访问范围会受到影响
     * 3、内部类可以直接访问外部类的成员﹔如果出现同名属性，优先访问内部类中定义的
     * 4、可以使用外部类.this.成员的方式，访问外部类中同名的信息
     * 5、外部类访问内部类信息，需要通过内部类实例，无法直接访问
     * 6、内部类编译后.class文件命名:外部类$内部类.class
     * 7、内部类的方法和外部类相同时，方法名()调用的是内部方法，调用外部方法则需外部类.this.成员的方式
     */
    public class Heart {
        String temp = "漂亮的";
        public void eat(){
            System.out.println("我是内部类的吃");
        }
        public String beat() {
            int age = 13;
            People.this.eat();
            eat();
            return age + "心脏在跳到" + People.this.age;
        }
    }
}
