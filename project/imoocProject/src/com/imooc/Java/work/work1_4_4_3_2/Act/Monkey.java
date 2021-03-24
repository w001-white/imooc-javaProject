package com.imooc.Java.work.work1_4_4_3_2.Act;

import com.imooc.Java.work.work1_4_4_3_2.Implement.IAct;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 16:42
 * @注释： 猴子
 */
public class Monkey extends Animal implements IAct {
    /**
     * 品种
     */
    public String type="金丝猴";
    @Override
    public void love() {
        System.out.println("爱好：喜欢模仿人的动作表情");
    }

    @Override
    public void skill() {
        System.out.println("技能：骑独轮车过独木桥");
    }

    @Override
    public void act() {
        System.out.println("表演者：Tom\n年龄：1岁\n品种：" + this.type );
        this.skill();
        this.love();
    }
}
