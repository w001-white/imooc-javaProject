package com.imooc.Java.InnerClassUse.MethodInnerClass.People2;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/24 23:49
 * @注释：
 */
public class MethodPeople {
    public static int age;

    /**
     * 方法内部类
     * 1、定义在方法内部,作用范围也在方法内
     * 2、和方法内部成员使用规则一样，class前面不可以添加public.private、protected、static
     * 3、类中不能包含静态成员
     * 4、类中可以包含final, abstract修饰的成员
     */
    public Object getHeart() {
        class Heart {
            String temp = "漂亮的";
            public int me = 20;


            public void play() {
                System.out.println("我是方法内部类中的方法");
            }

            public void eat() {
                System.out.println("我是内部类的吃");
            }

            public String beat() {
                new MethodPeople().eat();
                return temp + "心脏在跳动";
            }
        }
        return new Heart().beat();
    }

    public void eat() {
        System.out.println(age + "人会吃东西：外部类");
    }
}
