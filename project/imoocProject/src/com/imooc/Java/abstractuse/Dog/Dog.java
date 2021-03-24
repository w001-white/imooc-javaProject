package com.imooc.Java.abstractuse.Dog;

import com.imooc.Java.abstractuse.Animal.Animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 22:19
 * @注释：
 */
public class Dog extends Animal {
    public Dog(){

    }


    @Override
    public void eat() {
        System.out.println("我是狗，正在吃东西");
    }


}
