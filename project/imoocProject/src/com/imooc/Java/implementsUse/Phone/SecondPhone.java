package com.imooc.Java.implementsUse.Phone;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 10:42
 * @注释： 二代手机继承一代手机，并添加看视频、听音乐地功能（此时具备打电话、发短信、看视频、听音乐的功能）
 */
public class SecondPhone extends FistPhone{
    public static final int TEMP = 40;
    public SecondPhone(){}

    public void vedio(){
        System.out.println("手机可以看视频");
    }

    public void music(){
        System.out.println("手机可以听音乐");
    }

    public void connection(){
        System.out.println("我是SecondPhone类中的方法connection");;
    }
}
