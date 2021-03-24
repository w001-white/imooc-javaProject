package com.imooc.Java.QuoteUse.Staff;

import com.imooc.Java.QuoteUse.Company.Company;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/17 10:22
 * @注释： 使用成员属性，但是不初始化，会报空指针异常，3种解决方案
 * Exception in thread "main" java.lang.NullPointerException
 * 	at 引用数据类型应用_成员属性.Staff.Staff.display(Staff.java:29)
 * 	at 引用数据类型应用_成员属性.Test.Test.main(Test.java:16)
 */
public class Staff {
    // 员工姓名
    String name;
    // 员工年龄
    int age;
    // 所在公司
    Company company;


    public Staff(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("姓名："+ this.name +"\n年龄："+ this.age +"\n公司所在地："
                + this.company.name + "\n公司名称：" + this.company.address);
    }
}
