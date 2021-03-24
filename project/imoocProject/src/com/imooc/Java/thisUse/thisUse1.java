package com.imooc.Java.thisUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/8 20:03
 * @注释：
 */
public class thisUse1 {
    // 年龄、昵称
    int month;
    String name;

    public void run(int month){
        this.month = month;
        System.out.println("小猫已经" + month + "月大了");
    }

    public void eat(){
        this.name = "花花";
        System.out.println("名叫" + this.name + "的小猫在吃鱼");
    }

    /**
     * 去掉this：
     * 结论：大部分时候，类的方法中访问成员属性时无须使用this，但如果方法里存在局部变量和成员属性同名，
     *      但程序又需要在该方法里访问成员属性时，则必须使用this 进行调用。
     * @param month
     */
    public void run1(int month){
        month = month;
        System.out.println("小猫已经" + month + "月大了");
    }

    public void eat1(){
        name = "花花";
        System.out.println("名叫" + this.name + "的小猫在吃鱼");
    }

    /**
     * this调用。使用同一个类中的其它方法
     * 结论：大部分时候，类的成员方法访问同类中其他成员方法时，this关键字可加可不加，效果相同。
     */

    public void run3(int month){
        this.eat();
        eat();
    }

    public static void main(String[] args) {
        thisUse1 thisUse1 = new thisUse1();
        thisUse1.run(1);
        System.out.println("小猫已经" + thisUse1.month + "月大了");
        thisUse1.eat();

        System.out.println("---------");

        thisUse1 thisUse2 = new thisUse1();
        thisUse2.run1(2);
        System.out.println("小猫已经" + thisUse2.month + "月大了");
        thisUse2.eat1();

        System.out.println("---------");
        thisUse1.run3(3);
    }
}
