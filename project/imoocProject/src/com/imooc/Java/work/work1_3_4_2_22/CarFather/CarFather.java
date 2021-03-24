package com.imooc.Java.work.work1_3_4_2_22.CarFather;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/20 0:31
 * @注释： 车的父类
 */
public class CarFather {
    /**
     * 品牌
     */
    private String sort;
    /**
     * 颜色
     */
    private String color;
    /**
     * 轮子
     */
    private int wheel = 2;
    /**
     * 座椅
     */
    private int chair = 1;

    /**
     * 车的种类
     */
    private String name;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getChair() {
        return chair;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 无参构造方法
    public CarFather() {
    }

    // 双参构造，品牌和颜色
    public CarFather(String sort, String color) {
        this.setSort(sort);
        this.setColor(color);
    }

    // 四参构造，所有属性
    public CarFather(String sort, String color, int wheel, int chair) {
        this.setSort(sort);
        this.setColor(color);
        this.setWheel(wheel);
        this.setChair(chair);
    }

    public String info() {
        String str = this.getName()+"类信息测试：这是一辆" + this.getColor() + "颜色的，" + this.getSort()
                + "牌的非机动车，有" + this.getWheel() + "个轮子，有" + this.getChair() + "个座椅";
        return str;
    }

}
