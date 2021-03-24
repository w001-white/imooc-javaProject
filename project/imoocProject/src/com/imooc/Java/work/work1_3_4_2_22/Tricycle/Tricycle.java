package com.imooc.Java.work.work1_3_4_2_22.Tricycle;

import com.imooc.Java.work.work1_3_4_2_22.CarFather.CarFather;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 0:31
 * @注释： 三轮车类
 */
public class Tricycle extends CarFather {

    public Tricycle(){
        setWheel(3);
    }

    public String info() {
        String str = this.getName()+"类信息测试：" + this.getName() + "是一款有" + this.getWheel()
                + "个轮子的非机动车";
        return str;
    }
}
