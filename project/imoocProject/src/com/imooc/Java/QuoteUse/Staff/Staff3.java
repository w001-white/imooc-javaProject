package com.imooc.Java.QuoteUse.Staff;

import com.imooc.Java.QuoteUse.Company.Company;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/17 10:49
 * @注释：
 */
public class Staff3 {
    // 员工姓名
    public String name;
    // 员工年龄
    public int age;
    // 所在公司
    public Company company;

    // 方案3：如保留员工类、公司类初始代码不变（即员工类中公司属性定义和构造方法中均未初始化)，修改测试类中代码:加入对员工的公司属性赋值
    public Staff3(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("姓名："+ this.name +"\n年龄："+ this.age +"\n公司所在地："
                + this.company.name + "\n公司名称：" + this.company.address);
    }
}
