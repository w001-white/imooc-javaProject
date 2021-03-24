package com.imooc.Java.implementsUse.Phone;

import com.imooc.Java.implementsUse.Implements.IPhoto;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 10:43
 * @注释： 相机
 */
public class Camera implements IPhoto {
    @Override
    public void photo() {
        System.out.println("相机可以拍照");
    }
//    public void photo(){
//        System.out.println("相机可以拍照");
//    }

    //
//    interface aa {
//
//    }
}
