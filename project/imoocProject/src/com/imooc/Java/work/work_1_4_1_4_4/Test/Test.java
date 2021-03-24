package com.imooc.Java.work.work_1_4_1_4_4.Test;

import com.imooc.Java.work.work_1_4_1_4_4.Car.Car;
import com.imooc.Java.work.work_1_4_1_4_4.HomeCar.HomeCar;
import com.imooc.Java.work.work_1_4_1_4_4.Taxi.Taxi;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 23:04
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("黄色", "x先生");
        Car car2 = new Car("黄色", "x先生");
        car1.use();
        boolean flag = car1.equals(car2);
        System.out.println("car1和car2的引用比较:" + flag);

        System.out.println("=========================");
        Taxi taxi = new Taxi("蓝色", "张小泉");
        taxi.company = "长生";
        System.out.println(taxi.ride());
        taxi.use();
        System.out.println(taxi.toString());

        System.out.println("=========================");
        HomeCar homeCar = new HomeCar("紫色", "孙二娘", 7);
        homeCar.display();
        homeCar.display(5);
    }
}
