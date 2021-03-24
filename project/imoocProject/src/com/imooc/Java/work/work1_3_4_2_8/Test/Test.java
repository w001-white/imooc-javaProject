package com.imooc.Java.work.work1_3_4_2_8.Test;

import com.imooc.Java.work.work1_3_4_2_8.Father.Father;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 20:53
 * @注释：
 */
public class Test extends Father {
    /**
     * 编写测试用例的个数
     */
    public int testNum;
    /**
     * 发现BUG个数
     */
    public int BUGNum;

    public Test() {

    }

    public Test(int testNum, int BUGNum) {
        this.testNum = testNum;
        this.BUGNum = BUGNum;
    }

    public void Describe() {
        System.out.println(this.getSort() + "类信息测试：" + this.getSort() + "的日报是：" + "今天编写了" +
                this.testNum + ",发现了" + this.BUGNum + "个bug");
    }
}
