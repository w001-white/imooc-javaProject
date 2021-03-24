package com.imooc.Java.work.work1_4_4_3_2.Implement;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 11:27
 * @注释： 每个表演者的表演信息是通过调用act方法输出的
 */
public interface IAct {
    /**
     * 抽象方法，描述技能
     */
    public abstract void skill();
    /**
     * 抽象方法：描述表演
     */
    void act();
}
