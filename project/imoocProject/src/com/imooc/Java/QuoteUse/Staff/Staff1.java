package com.imooc.Java.QuoteUse.Staff;

import com.imooc.Java.QuoteUse.Company.Company;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/17 10:42
 * @注释： 解决方案1：引用时初始化
 */
public class Staff1 {
    // 员工姓名
    String name;
    // 员工年龄
    int age;
    // 所在公司
    // 方案1：修改员工类中代码:加入对员工的公司属性初始化设置
    Company company= new Company("名字1", "地址1");


    public Staff1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("姓名："+ this.name +"\n年龄："+ this.age +"\n公司所在地："
                + this.company.name + "\n公司名称：" + this.company.address);
    }
}
