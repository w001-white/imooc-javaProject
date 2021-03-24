package com.imooc.Java.thisUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/8 22:54
 * @注释：
 * 在方法调用的时候，作为参数传递,在thisUse2类中，定义run方法，方法参数为thisUse2类型对象。call方法中，调用run方法，并通过this指代,传入当前对象。
 * 结论：this在调用的时候，this可以作为方法参数进行传递，代表调用方法的当前对象。
 */
public class thisUse2 {
    String name;

    public void call(){
        run(this);
    }

    /**
     * 上边的call相当于此方法，只是在调用的时候需要传参cat.call(cat);
     */
    public void call(thisUse2 temp){
        run(temp);
    }

    public void run(thisUse2 cat){
        System.out.println("昵称为：" + cat.name + "的小猫在奔跑");
    }

    public static void main(String[] args) {
        thisUse2 cat = new thisUse2();
        cat.name = "花花";
        cat.call();

        System.out.println("----------");
        cat.name = "画虎";
        cat.call(cat);
    }

}
