package com.imooc.Java.work.work1_4_4_3_2.Act;

import com.imooc.Java.work.work1_4_4_3_2.Implement.IAct;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 16:43
 * @注释： 鹦鹉
 */
public class Parrot extends Animal implements IAct {
    /**
     * 品种
     */
    public String type = "金刚鹦鹉";

    @Override
    public void love() {
        System.out.println("爱好：喜欢说话");
    }

    @Override
    public void skill() {
        System.out.println("技能：能够模仿100种语言");
    }

    @Override
    public void act() {
        System.out.println("表演者：PangPang\n年龄：1岁\n品种：" + this.type);
        this.love();
        this.skill();
    }
}
