package com.imooc.Java.work.work1_3_4_2_22.Electric;

import com.imooc.Java.work.work1_3_4_2_22.CarFather.CarFather;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 0:31
 * @注释： 电动车类
 */
public class Electric extends CarFather {
    /**
     * 电池品牌
     */
    private String eleName;

    public String getEleName() {
        return eleName;
    }

    public void setEleName(String eleName) {
        this.eleName = eleName;
    }

    public String info() {
        String str = this.getName() + "类信息测试：这是一辆使用" + this.getEleName() + "牌电池的" + this.getName();
        return str;
    }
}
