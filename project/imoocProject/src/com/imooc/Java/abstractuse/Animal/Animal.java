package com.imooc.Java.abstractuse.Animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 22:19
 * @注释：
 */
// 抽象类
public abstract class Animal  {
    String name;
    int month;

    public Animal() {

    }

    // 子类只需实现
    public void aa(){}

    // 抽象方法：不允许包含方法体
    // 子类必须重写该方法
    // 若不想重写该方法，则需要把该类（Sheep）也定义为abstract类或者把public改为final（final和abstract同时使用）,但此方法也不能实例化（new Sheep（））
    public abstract void eat();
}
