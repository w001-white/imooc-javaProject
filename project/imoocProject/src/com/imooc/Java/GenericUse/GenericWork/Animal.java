package com.imooc.Java.GenericUse.GenericWork;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 14:59
 * @注释：
 */
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();
}
