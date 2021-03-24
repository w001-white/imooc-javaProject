package com.imooc.Java.work.work1_3_4_2_22.Bicycle;

import com.imooc.Java.work.work1_3_4_2_22.CarFather.CarFather;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 0:32
 * @注释： 自行车类
 */
public class Bicycle extends CarFather {

    public Bicycle(){

    }

    public Bicycle(String sort, String color){
        super(sort,color);
    }

    public String info() {
        String str = this.getName()+"类信息测试：这是一辆" + this.getColor() + "颜色的，" + this.getSort()
                + "牌的"+this.getName();
        return str;
    }
}
