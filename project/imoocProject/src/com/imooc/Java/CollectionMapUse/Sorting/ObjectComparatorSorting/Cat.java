package com.imooc.Java.CollectionMapUse.Sorting.ObjectComparatorSorting;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 20:09
 * @注释：
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
}
