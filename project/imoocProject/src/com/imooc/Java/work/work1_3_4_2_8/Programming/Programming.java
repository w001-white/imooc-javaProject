package com.imooc.Java.work.work1_3_4_2_8.Programming;

import com.imooc.Java.work.work1_3_4_2_8.Father.Father;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 20:53
 * @注释：
 */
public class Programming extends Father {
    /**
     * 编写代码行数
     */
    public int programmingNum;
    /**
     * 未解决的BUG个数
     */
    public int messBUGNum;

    public Programming() {

    }

    public Programming(int programmingNum, int messBUGNum) {
        this.programmingNum = programmingNum;
        this.messBUGNum = messBUGNum;
    }

    public void Describe() {
        System.out.println(this.getSort() + "类信息测试：" + this.getSort() + "的日报是：" + "今天编写了" +
                this.programmingNum + "行代码,目前仍有" + this.messBUGNum + "个bug没有解决");
    }
}
