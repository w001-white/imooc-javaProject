package com.imooc.Java.work.work1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/6 17:30
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.student();
        person.student("男");

        person.name = "李明";
        person.age = 10;
        person.grade = "五";
        person.mySelf();
    }
}
