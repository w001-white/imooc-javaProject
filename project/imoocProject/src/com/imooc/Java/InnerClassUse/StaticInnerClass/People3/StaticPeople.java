package com.imooc.Java.InnerClassUse.StaticInnerClass.People3;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 23:24
 * @注释：
 */

// 外部类
public class StaticPeople {
    public int age;

    public Heart getHeart() {
        return new Heart();
    }

    public void eat() {
        System.out.println(new Heart().temp + "人会吃东西：外部类");
    }

    /**
     * 1、静态内部类中，只能直接访问外部类的静态类（成员），如果需要调用非静态类（成员），可以通过对象实例
     * 2、静态内部类对象实例时，可以不依赖于外部类对象
     * 3、可以通过外部类,内部类.静态成员的方式，访问内部类中的静态成员
     * 4、当内部类属性与外部类属性同名时，默认直接调用内部类中的成员;
     *    如果需要访问外部类中的静态属性，则可以通过外部类.属性的方式;
     *    如果需要访问外部类中的非静态属性，则可以通过new外部类().属性的方式;
     */
    public static class Heart {
        String temp = "漂亮的";
        // 可以定义静态变量
        public static int me = 20;
        // 静态方法
        public static void play(){
            System.out.println("我是静态内部类中的静态方法");
        }
        public void eat(){
            System.out.println("我是内部类的吃");
        }
        public String beat() {
            int age = 13;
            // 静态方法无法直接调用非静态方法
            // 方式1：把上边的eat()修改为static

            // 方式2：可以通过对象实例
            new StaticPeople().eat();
//            StaticPeople.this.eat();
            eat();
            return age + "心脏在跳到" + new StaticPeople().age;
        }
    }
}
