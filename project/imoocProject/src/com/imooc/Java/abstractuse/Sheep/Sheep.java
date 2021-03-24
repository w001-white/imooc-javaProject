package com.imooc.Java.abstractuse.Sheep;

import com.imooc.Java.abstractuse.Animal.Animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/22 20:24
 * @注释：
 */
public abstract class Sheep extends Animal {
    public Sheep(){

    }

    public void eat(){}
    // 若不想重写该方法，则需要把该类也定义为abstract类
//    public void eat(){
//
//    }
}
