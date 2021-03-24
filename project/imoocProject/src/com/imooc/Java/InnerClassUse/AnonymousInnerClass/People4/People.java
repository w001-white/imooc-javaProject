package com.imooc.Java.InnerClassUse.AnonymousInnerClass.People4;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 10:37
 * @注释：
 */
public abstract class People {
    private String name;

    public People(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read();
}
