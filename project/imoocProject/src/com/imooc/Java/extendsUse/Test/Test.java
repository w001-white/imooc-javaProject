package com.imooc.Java.extendsUse.Test;

import com.imooc.Java.extendsUse.son.Son;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 23:44
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 1、子类初始化的时候会优先加载父类（如果父类还有父类，则会优先加载父类的父类）
         * 2、加载父类中的静态变量以及静态代码块
         * 3、加载子类的静态变量以及静态代码块
         * 4、初始化父类的普通代码块以及无参构造方法
         * 5、初始化子类的普通代码块以及无参构造方法
         */
        Son son = new Son();
        System.out.println(son.son());
    }


}
