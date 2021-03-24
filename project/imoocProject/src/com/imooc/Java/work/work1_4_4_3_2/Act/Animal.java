package com.imooc.Java.work.work1_4_4_3_2.Act;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 11:25
 * @注释：
 */
public abstract class Animal {
    /**
     * 昵称
     */
    public String name;

    /**
     * 年龄
     */
    public int age;

    public Animal(){

    }

    /**
     * 抽象方法：描述喜好
     */
    public abstract void love();
}
