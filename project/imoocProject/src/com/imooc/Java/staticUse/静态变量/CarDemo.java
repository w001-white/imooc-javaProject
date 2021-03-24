package com.imooc.Java.staticUse.静态变量;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/15 23:26
 * @注释：
 */
public class CarDemo {
    static String firm; // 厂商
    int price;

    public CarDemo(int price) {
        this.price = price;
    }
    public void display(){
        // 类内静态成员访问方式1:类名.成员名
        System.out.println("厂商是：" + CarDemo.firm + ";车的颜色是：" + this.price);
        // 类内静态成员访问方式2:成员名
        System.out.println("厂商是：" + firm + ";车的颜色是：" + this.price);
        // 类内静态成员访问方式3:this.成员名
        System.out.println("厂商是：" + this.firm + ";车的颜色是：" + this.price);
    }
}
