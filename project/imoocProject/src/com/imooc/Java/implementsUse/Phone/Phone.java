package com.imooc.Java.implementsUse.Phone;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 9:22
 * @注释： 手机父类,原始手机
 */
public class Phone {
    /**
     * 品牌
     */
    private String brand;
    /**
     * 售价
     */
    private int price;

    public Phone(){

    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(){
        System.out.println("手机可以打电话");
    }
}
