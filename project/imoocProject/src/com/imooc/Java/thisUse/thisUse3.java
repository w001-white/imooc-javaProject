package com.imooc.Java.thisUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/8 23:13
 * @注释：
 * 在方法调用时，作为返回值传递
     * this可以作为方法返回值，代表返回当前调用对象。
 */
public class thisUse3 {
    String name;
    int n;

    public thisUse3 call(String name, int n){
        this.n = n;
        this.name = name;
        return this;
    }

    public static void main(String[] args) {
        thisUse3 thisUse3= new thisUse3();
        thisUse3 temp = thisUse3.call("花花", 1);
        System.out.println(temp.name + thisUse3.n);
    }
}
