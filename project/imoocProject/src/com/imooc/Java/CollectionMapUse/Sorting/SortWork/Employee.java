package com.imooc.Java.CollectionMapUse.Sorting.SortWork;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 23:40
 * @注释：
 */
public class Employee implements Comparable<Employee> {
    private String id;
    private String name;
    private double price;

    public Employee(String id, String name, double price) {
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
        return "id='" + id + ", name=" + name + ", price=" + price ;
    }

    @Override
    public int compareTo(Employee o) {
        double price1 = this.price;
        double price2 = o.price;
        int price = new Double(price2 - price1).intValue();
        return price;
    }
}
