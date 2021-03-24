package com.imooc.Java.InnerClassUse.MemberInnerClass.People1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 23:24
 * @注释： 成员内部类
 */
public class PeopleTest {
    public static void main(String[] args) {
        People people = new People();
        people.age = 12;

        // 同一个包下也不可直接访问内部类
//        Heart heart = new Heart();

        // 获取内部类对象实例，方式1: new外部类.new内部类
        // 但是此方法此时传入的参数age的值无效,因为此时是新产生的People的实例对象，与上边的实例无关
        People.Heart heart = new People().new Heart();
        System.out.println(heart.beat());

        // 获取内部类对象实例,方式2:外部类对象. new内部类
        heart = people.new Heart();
        System.out.println(heart.beat());

        // 获取内部类对象实例，方式3:外部类对象.获取方法
        heart = people.getHeart();
        System.out.println(heart.beat());
    }
}
