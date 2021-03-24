package com.imooc.Java.abstractuse.Cat;

import com.imooc.Java.abstractuse.Animal.Animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 22:19
 * @注释：
 */
public class Cat extends Animal {
    public Cat(){

    }

    @Override
    public void eat() {
        System.out.println("我是猫，正在吃东西");
    }

    public void run(){
        System.out.println("小喵快跑");
    }
}
