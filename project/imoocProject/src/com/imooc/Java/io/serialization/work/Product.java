package com.imooc.Java.io.serialization.work;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 16:45
 * @注释：
 */
public class Product implements Serializable {
    // 产品id
    public int id;
    // 产品名称
    public String name;
    // 产品属性
    public String categories;
    // 产品价格
    public double price;

    public Product(int id, String name, String categories, double price) {
        this.id = id;
        this.name = name;
        this.categories = categories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "产品id：" + id + "\n产品名称：" + name +"\n产品属性：" + categories +"\n产品价格：" + price;
    }
}
