package com.imooc.Java.PolymorphicUse.Animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 22:19
 * @注释：
 */
public class Animal {
    private String name;
    private int month;

    public Animal(){

    }

    public Animal(String name, int month){
        this.setName(name);
        this.setMonth(month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void eat(){
        System.out.println("我是父类,动物吃东西");
    }
}
