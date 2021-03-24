package com.imooc.Java.privateUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/9 16:29
 * @注释：private的使用
 */
public class Test001 {
    public static void main(String[] args) {
        privateUse001 privateUse001 = new privateUse001();

        privateUse001.setName("花花");
        System.out.println(privateUse001.getName());

        privateUse001.setArg(-1);
        System.out.println(privateUse001.getArg());

        privateUse001 privateUse0011 = new privateUse001(-1);
        // 当方法中出现return表示方法运行终止;当出现break则表示循环语句或者swith语句运行结束。
        if(privateUse0011.getArg() <= 0)
            return;
        System.out.println("通过构造方法进行赋值的年龄：" + privateUse0011.getArg());
    }

}
