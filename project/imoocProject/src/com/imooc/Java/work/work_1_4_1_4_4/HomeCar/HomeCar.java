package com.imooc.Java.work.work_1_4_1_4_4.HomeCar;

import com.imooc.Java.work.work_1_4_1_4_4.Car.Car;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 23:03
 * @注释： 私家车，继承Car
 */
public final class HomeCar extends Car {
    /**
     * 载客数
     */
    public int num;

    public HomeCar() {

    }

    public HomeCar(String color, String useName, int num) {
        super(color, useName);
        this.num = num;
    }

    public void display() {
        System.out.println(this.useName + "拥有的" + this.color + "颜色的私家车有" + this.num + "座位");
    }

    public void display(int num) {
        System.out.println("家用汽车大多有" + num + "个座位");
    }
}
