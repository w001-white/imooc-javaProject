package com.imooc.Java.CollectionMapUse.Set.SetCase;

import java.util.Objects;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/5 22:13
 * @注释： 宠物猫
 */
public class Cat {
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private int month;
    /**
     * 品种
     */
    private String species;

    public Cat(String name, int month, String species) {
        this.setName(name);
        this.setMonth(month);
        this.setSpecies(species);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return
                "姓名：'" + name + '\'' +
                        ", 月份：" + month +
                        ", 品种：'" + species + '\'';
    }

    @Override
    public boolean equals(Object o) {
        // equals两种写法
        // equals自动生成的代码
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getMonth() == cat.getMonth() && Objects.equals(getName(), cat.getName()) && Objects.equals(getSpecies(), cat.getSpecies());

        // 修改的代码，判断对象是否相等，相等返回true，不用继续比较属性
//        if (this == o) return true;
//        // 判断传进来的对象o是不是Cat类型
//        if (o.getClass() == Cat.class){
//            // 如果不是则强制转换为Cat对象
//            Cat cat = (Cat) o;
//            return cat.getName().equals(name) && (cat.getMonth() == month)  && cat.getSpecies().equals(species);
//        }
//        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMonth(), getSpecies());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Cat)) return false;
//        Cat cat = (Cat) o;
//        return getMonth() == cat.getMonth() && Objects.equals(getName(), cat.getName()) && Objects.equals(getSpecies(), cat.getSpecies());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), getMonth(), getSpecies());
//    }
}
