package com.imooc.Java.work.work1_4_4_3_2.Act;

import com.imooc.Java.work.work1_4_4_3_2.Implement.IAct;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 16:46
 * @注释： 小丑
 */
public class Clown implements IAct {
    /**
     * 身穿特点
     */
    public String dress = "着装：身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆";

    @Override
    public void skill() {
        System.out.println("技能：脚踩高跷,进行杂技魔术表演");
    }

    @Override
    public void act() {
        System.out.println("表演者:Kahle\n艺龄:5年\n" + this.dress);
        this.skill();
    }
}
