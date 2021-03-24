package com.imooc.Java.work.work1_4_4_3_2.Act;

import com.imooc.Java.work.work1_4_4_3_2.Implement.IAct;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 11:29
 * @注释： 棕熊
 */
public class Bear extends Animal implements IAct {
    public Bear(){

    }
    @Override
    public void love() {
        System.out.println("爱好：喜欢卖萌");
    }

    @Override
    public void skill() {
        System.out.println("技能：挽着花篮,打着雨伞，自立走秀");
    }

    @Override
    public void act() {
        System.out.println("表演者：Bill\n年龄：1岁");
        this.skill();
        this.love();
    }

}
