package com.imooc.Java.implementsUse.Phone;

import com.imooc.Java.implementsUse.Implements.INet;
import com.imooc.Java.implementsUse.Implements.IPhoto;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 11:25
 * @注释：
 */
public class SmartWatch implements INet, IPhoto {

    public static final int TEMP = 30;

    public SmartWatch(){}

    @Override
    public void net() {

    }

    @Override
    public void photo() {

    }

    // 若两个接口中具有相同名字的默认方法，则需要在类中重写这个默认方法
    @Override
    public void connection() {
        // 调用接口中的方法
        System.out.println("我是SmartWatch接口中的默认链接");
    }

    /**
     * 在实现类中需要通过接口名进行访问
     * 实现类无法继承(即直接应用)接口中的静态方法
     * 实现类无法重写静态方法，可以存在相同格式静态方法，但两者独立存在。
     */
    public static void stop(){

    }


}
