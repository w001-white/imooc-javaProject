package com.imooc.Java.DownPolymorphicUse.French;

import com.imooc.Java.DownPolymorphicUse.Person.Person;

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

    public void sport(){
        System.out.println("法国人也喜欢击剑");
    }
}
