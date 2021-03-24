package com.imooc.Java.work.work1_3_4_2_22.Test;

import com.imooc.Java.work.work1_3_4_2_22.Bicycle.Bicycle;
import com.imooc.Java.work.work1_3_4_2_22.CarFather.CarFather;
import com.imooc.Java.work.work1_3_4_2_22.Electric.Electric;
import com.imooc.Java.work.work1_3_4_2_22.Tricycle.Tricycle;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 0:32
 * @注释：
 */
public class test {
    public static void main(String[] args) {
        CarFather carFather = new CarFather("天宇", "红", 4, 2);
        carFather.setName("父");
        System.out.println(carFather.info());

        Bicycle bicycle = new Bicycle("捷安特", "黄");
        bicycle.setName("自行车");
        System.out.println(bicycle.info());

        Electric electric = new Electric();
        electric.setName("电动车");
        electric.setEleName("飞鸽");
        System.out.println(electric.info());

        Tricycle tricycle = new Tricycle();
        tricycle.setName("三轮车");
        System.out.println(tricycle.info());
    }
}
