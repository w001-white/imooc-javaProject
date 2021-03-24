package com.imooc.Java.implementsUse.Test;

import com.imooc.Java.implementsUse.Implements.INet;
import com.imooc.Java.implementsUse.Implements.IPhoto;
import com.imooc.Java.implementsUse.Phone.Camera;
import com.imooc.Java.implementsUse.Phone.Phone;
import com.imooc.Java.implementsUse.Phone.SmartWatch;
import com.imooc.Java.implementsUse.Phone.ThirdPhone;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 9:23
 * @注释：
 */

// 在一个Java文件中可以存在多个类，多个接口，但是只能存在一个public修饰的类或接口，且此时文件名需要与public修饰的类或者接口同名
interface aaa {

}

class aa{

}

public class Test implements aaa{
    public static void main(String[] args) {
        // 实例化四代手机，具有打电话、发短信、看视频、听音乐、拍照、上网、玩游戏的功能
        ThirdPhone phone = new ThirdPhone();
        phone.call();
        phone.message();
        phone.vedio();
        phone.music();
        phone.photo();
        phone.net();
        phone.game();
        System.out.println("=======================");

        /**
         * 接口用来描述不同对象具有相同的实例特征
         * 接口只具备接口的方法，而不具备其它类的方法
         * 定义接口的类必须重写接口的方法
         */

        IPhoto iPhoto = new ThirdPhone();
        iPhoto.photo();

        iPhoto = new Camera();
        iPhoto.photo();
        System.out.println("=======================");

        // 接口中可以定义常量量，默认public static final，因此可以删去
        // 访问接口常量可以使用：接口.常量名
        System.out.println(INet.TEMP);

        INet iNet = new SmartWatch();
        System.out.println(iNet.TEMP);// 20?30
        SmartWatch smartWatch = new SmartWatch();
        System.out.println(smartWatch.TEMP);

        // 接口中的默认方法调用，对象.方法
        iNet.connection();
        // 接口中的静态方法调用：接口.方法
        INet.stop();

        // 若两个接口中具有相同名字的默认方法，则需要在类中重写这个默认方法，调用的是重写之后的connection方法
        System.out.println("=======================");
        INet iNet1 = new SmartWatch();
        iNet1.connection();

        // 若两个接口以及父类中都具有相同名字的方法，则会运行父类中的方法
        INet iNet2 = new ThirdPhone();
        iNet2.connection();

        Phone thirdPhone = new ThirdPhone();
        ThirdPhone thirdPhone1 = (ThirdPhone)thirdPhone;
        thirdPhone1.Int();
    }
}
