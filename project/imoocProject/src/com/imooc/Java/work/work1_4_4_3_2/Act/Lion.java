package com.imooc.Java.work.work1_4_4_3_2.Act;

import com.imooc.Java.work.work1_4_4_3_2.Implement.IAct;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 16:38
 * @注释： 狮子
 */
public class Lion extends Animal implements IAct {
    /**
     * 颜色
     */
    public String color = "灰色"  ;
    /**
     * 性别
     */
    public String sex = "公狮";

    @Override
    public void skill() {
        System.out.println("技能:擅长钻火圈");
    }

    @Override
    public void act() {
        System.out.println("表演者：Lain\n年龄：2岁\n性别：" + this.sex + "\n毛色：" + this.color);
        this.skill();
        this.love();
    }

    @Override
    public void love() {
        System.out.println("爱好:喜欢吃各种肉类");
    }
}
