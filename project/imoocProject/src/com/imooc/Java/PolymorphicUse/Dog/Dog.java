package com.imooc.Java.PolymorphicUse.Dog;

import com.imooc.Java.PolymorphicUse.Animal.Animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 22:19
 * @注释：
 */
public class Dog extends Animal {
    public Dog(){

    }

    public Dog(String name, int month){
        super(name, month);
    }

    @Override
    public void eat() {
        System.out.println("我是狗，正在吃东西");
    }


}
