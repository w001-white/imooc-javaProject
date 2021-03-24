package com.imooc.Java.upPolymorphicUse.French;

import com.imooc.Java.upPolymorphicUse.Person.Person;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 23:15
 * @注释：
 */
public class French extends Person {
    public French(){}

    @Override
    public void eat() {
        System.out.println("法国人喜欢喝红酒");
    }
}
