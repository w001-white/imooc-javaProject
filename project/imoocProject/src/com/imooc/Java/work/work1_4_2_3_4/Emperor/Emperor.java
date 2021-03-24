package com.imooc.Java.work.work1_4_2_3_4.Emperor;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 19:53
 * @注释： 懒汉式练习
 */
public class Emperor {
    // 1、创建类中私有构造
    private Emperor() {

    }

    // 2、创建静态的该类实例对象
    private static Emperor emperor = null;

    // 3、创建公有的静态方法返回静态实例对象
    public static Emperor getEmperor(){
        if(emperor == null)
            emperor = new Emperor();
        return emperor;
    }
}
