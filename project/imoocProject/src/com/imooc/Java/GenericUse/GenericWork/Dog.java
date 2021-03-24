package com.imooc.Java.GenericUse.GenericWork;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 15:00
 * @注释：
 */
public class Dog extends Animal {
    @Override
    public void play() {
        System.out.println("小狗" + getName() + "在做游戏");
    }
}
