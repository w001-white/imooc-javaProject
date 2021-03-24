package com.imooc.Java.work.work_1_4_1_4_4.Taxi;

import com.imooc.Java.work.work_1_4_1_4_4.Car.Car;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 23:03
 * @注释： 出租车类继承Car
 */
public class Taxi extends Car {
    /**
     * 所属公司
     */
    public String company;

    public Taxi(){}

    public Taxi(String color, String useName) {
        super(color, useName);
    }

    public final String ride() {
        String str = this.useName + "的出租车是属于" + this.company + "公司的";
        return str;
    }

    @Override
    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    @Override
    public String toString() {
        return "taxi的信息是:" + this.useName + "拥有一辆" + this.color + "的出租车";

    }
}
