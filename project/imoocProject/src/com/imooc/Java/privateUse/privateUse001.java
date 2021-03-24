package com.imooc.Java.privateUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/9 16:29
 * @注释：
 */
public class privateUse001 {
    // 修改属性的可见性---设置name为private属性，限定只可在当前类中访问
    private  String name;
    private int arg;

    // private在同一个类中可以直接访问，但是在不同的类中需要通过get/set方法访问
    public privateUse001(){

    }

    public privateUse001(int arg){
        // 不能使用直接赋值，因为使用直接赋值会导致get/set中判定没用，因此要改用内部方法
        //this.arg = arg;
        setArg(arg);
    }

    // 设置get/set方法
    // 对get/set方法中添加限定条件
    public String getName(){
        return "我是一只名叫：" + this.name + "的猫咪";
    }

    public void setName(String name){
        this.name = name;
    }

    public int getArg() {
        return this.arg;
    }

    public void setArg(int arg) {
        if(arg <= 0)
            System.out.println("输入信息错误");
        else
            this.arg = arg;
    }
}
