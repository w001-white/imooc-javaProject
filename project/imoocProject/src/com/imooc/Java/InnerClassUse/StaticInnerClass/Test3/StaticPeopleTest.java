package com.imooc.Java.InnerClassUse.StaticInnerClass.Test3;

import com.imooc.Java.InnerClassUse.StaticInnerClass.People3.StaticPeople;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 23:24
 * @注释： 成员内部类
 */
public class StaticPeopleTest {
    public static void main(String[] args) {
        StaticPeople people = new StaticPeople();
        people.age = 12;

        // 获取静态内部类对象实例，方式1: new外部类.内部类
        // 但是此方法此时传入的参数age的值无效,因为此时是新产生的People的实例对象，与上边的实例无关
        StaticPeople.Heart heart = new StaticPeople.Heart();
        System.out.println(heart.beat());


        // 获取内部类对象实例，方式2:外部类对象.获取方法
        heart = people.getHeart();
        System.out.println(heart.beat());

        // 访问静态内部类中的静态方法以及静态成员
        StaticPeople.Heart.play();
//        heart.eat();
//        people.getHeart().eat();
        System.out.println(StaticPeople.Heart.me);
    }
}
