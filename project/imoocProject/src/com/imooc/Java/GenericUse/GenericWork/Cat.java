package com.imooc.Java.GenericUse.GenericWork;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 15:01
 * @注释：
 */
public class Cat extends Animal {
    public Cat(String name){
        this.setName(name);
    }
    @Override
    public void play() {
        System.out.println("小猫" + getName() + "在做游戏");
    }
}
