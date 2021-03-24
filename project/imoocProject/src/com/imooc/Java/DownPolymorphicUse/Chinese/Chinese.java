package com.imooc.Java.DownPolymorphicUse.Chinese;

import com.imooc.Java.DownPolymorphicUse.Person.Person;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 23:15
 * @注释：
 */
public class Chinese extends Person {
    public Chinese(){}

    @Override
    public void eat() {
        System.out.println("中国人喜欢吃饺子");
    }

    public void sport(){
        System.out.println("中国人也喜欢打太极");
    }
}
