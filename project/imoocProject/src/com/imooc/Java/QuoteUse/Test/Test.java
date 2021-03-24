package com.imooc.Java.QuoteUse.Test;

import com.imooc.Java.QuoteUse.Company.Company;
import com.imooc.Java.QuoteUse.Staff.Staff1;
import com.imooc.Java.QuoteUse.Staff.Staff2;
import com.imooc.Java.QuoteUse.Staff.Staff3;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/17 10:30
 * @注释：  引用数据类型应用_成员属性
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company("名字", "地址");
//        Staff st1 = new Staff("张三", 30);
//        st1.display();
        // 解决方案一：
        Staff1 st2 = new Staff1("李四", 31);
        st2.display();
        System.out.println("=============");
        // 解决方案二：
        Staff2 st3 = new Staff2("王五", 32);
        st3.display();
        System.out.println("=============");
        // 解决方案三：
        Staff3 st4 = new Staff3("麻子", 33);
        st4.company = company;
        st4.display();
    }
}
