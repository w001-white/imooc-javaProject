package com.imooc.Java.work.work_1_4_1_4_4.Car;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 23:03
 * @注释： 父类：车的共性
 */
public class Car {
    /**
     * 车的颜色
     */
    public String color;
    /**
     * 车主姓名
     */
    public String useName;

    // 无参构造
    public Car() {
    }

    // 有参构造，给变量赋值
    public Car(String color, String useName) {
        this.color = color;
        this.useName = useName;
    }

    public void use() {
        System.out.println("我是机动车！");
    }

    public boolean equals(Car car) {
        if (car == null)
            return false;
//        System.out.println(this.color);
        if ((this.color.equals(car.color)) && (this.useName.equals(car.useName)))
            return true;
        else
            return false;
    }
}
