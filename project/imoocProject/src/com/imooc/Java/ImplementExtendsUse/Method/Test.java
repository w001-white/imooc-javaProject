package com.imooc.Java.ImplementExtendsUse.Method;

import com.imooc.Java.ImplementExtendsUse.Implement.IFather2;
import com.imooc.Java.ImplementExtendsUse.Implement.ISon;
import com.imooc.Java.ImplementExtendsUse.Implement.ISon2;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 22:30
 * @注释： 接口的继承
 */
public class Test implements ISon, ISon2 {

    @Override
    public void eat() {

    }

    @Override
    public void dunrk() {
        System.out.println("11");
    }

    @Override
    public void play() {

    }

    public static void main(String[] args) {
        Test test = new Test();
        ISon iSon = new Test();
        iSon.connection();
        //如果是单继承，即子接口只有一个父接口，则可继承父接口中定义的常量、抽象方法、默认方法，无法继承静态方法
//        iSon.connection1();
        IFather2.connection1();
    }
}
