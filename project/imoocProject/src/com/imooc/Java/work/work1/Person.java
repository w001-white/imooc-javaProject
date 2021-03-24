package com.imooc.Java.work.work1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/6 17:24
 * @注释：
 */
public class Person {
    // 姓名
    String name;
    // 年龄
    int age;
    // 班级
    String grade;

    void student(){
        System.out.println("我是一名学生");
    }

    void student(String sex){
        System.out.println("我是一个" + sex + "孩");
    }

    void mySelf(){
        System.out.println("我叫" + name + "，我今年" + age + "岁了，" + "读" + grade + "年级");
    }
}
