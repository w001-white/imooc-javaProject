package com.imooc.Java.implementsUse.Phone;

import com.imooc.Java.implementsUse.Implements.INet;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 11:01
 * @注释： 电脑具有的功能
 */

// 如果不想实现接口的方法就需要把Computer定义为abstract抽象类
public abstract class Compter implements INet {
    public void photo() {
        System.out.println("电脑可以拍照");
    }

//    public void net() {
//        System.out.println("电脑可以上网");
//    }

    @Override
    public void net() {
        System.out.println("电脑可以上网");
    }

    public void game() {
        System.out.println("电脑可以玩游戏");
    }

    public void vedio() {
        System.out.println("电脑可以看视频");
    }

    public void music() {
        System.out.println("电脑可以听音乐");
    }
}
