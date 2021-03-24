package com.imooc.Java.PolymorphicUse.Cat;

import com.imooc.Java.PolymorphicUse.Animal.Animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 22:19
 * @注释：
 */
public class Cat extends Animal {
    public Cat(){

    }

    public Cat(String name, int month){
        super(name, month);
    }

    @Override
    public void eat() {
        System.out.println("我是猫，正在吃东西");
    }

    public void run(){
        System.out.println("小喵快跑");
    }
}
