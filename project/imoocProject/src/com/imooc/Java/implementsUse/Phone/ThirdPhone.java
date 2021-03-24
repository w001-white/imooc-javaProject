package com.imooc.Java.implementsUse.Phone;

import com.imooc.Java.implementsUse.Implements.INet;
import com.imooc.Java.implementsUse.Implements.IPhoto;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 10:42
 * @注释： 三代手机继承二代手机，并添加拍照、上网、玩游戏地功能（此时具备打电话、发短信、看视频、听音乐、拍照、上网、玩游戏的功能）
 */
public class ThirdPhone extends SecondPhone implements IPhoto, INet {
    public ThirdPhone(){}

//    public void photo(){
//        System.out.println("手机可以拍照");
//    }

//    public void net(){
//        System.out.println("手机可以上网");
//    }

    public void game(){
        System.out.println("手机可以玩游戏");
    }

    @Override
    public void photo() {
        System.out.println("手机可以拍照");
    }

    @Override
    public void net() {

    }

    // 若父类和接口中存在相同名字的常量或者变量（父类），则在调用的时候需要标明调用的是哪个参数，与相同名字的方法的调用区分开
    // 或者在类中定义自己的TEMP常量
    int TEMP = 60;
    public void Int(){
        System.out.println(INet.TEMP);
        System.out.println(TEMP);
    }
}
