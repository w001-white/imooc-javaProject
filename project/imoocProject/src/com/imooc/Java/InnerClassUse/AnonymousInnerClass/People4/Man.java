package com.imooc.Java.InnerClassUse.AnonymousInnerClass.People4;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 10:39
 * @注释：
 */
public class Man extends People{
    @Override
    public void read() {
        System.out.println("男生喜欢读科幻类小说");
    }

    public void test(){
        System.out.println("我是Man独有的方法");
    }
}
