package com.imooc.Java.CollectionMapUse.Sorting.ObjectComparableSorting;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 22:07
 * @注释：
 */
public class Goods implements Comparable<Goods>{
    // 商品编号
    private String id;
    // 商品名称
    private String name;
    // 商品价格
    private double price;

    public Goods(String id, String name, double price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "商品编号:" + id + ", 商品名称:" + name + ", 商品价格:" + price;
    }

    @Override
    public int compareTo(Goods o) {
        double price1 = this.getPrice();
        double price2 = o.getPrice();
        // 升序
        int price = new Double(price1 - price2).intValue();
        return price;
    }
}
