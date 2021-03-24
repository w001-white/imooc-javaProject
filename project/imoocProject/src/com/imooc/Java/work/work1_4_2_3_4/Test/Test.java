package com.imooc.Java.work.work1_4_2_3_4.Test;

import com.imooc.Java.work.work1_4_2_3_4.Emperor.Emperor;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 19:53
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("创建1号皇帝");
        Emperor emperor1 = Emperor.getEmperor();
        System.out.println("创建2号皇帝");
        Emperor emperor2 = Emperor.getEmperor();
        System.out.println("创建3号皇帝");
        Emperor emperor3 = Emperor.getEmperor();
        System.out.println("三个皇帝对象依次是：");
        System.out.println(emperor1+"\n"+emperor2+"\n"+emperor3);
    }
}
