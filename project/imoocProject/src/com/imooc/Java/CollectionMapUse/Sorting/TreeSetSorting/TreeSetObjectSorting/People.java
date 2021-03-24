package com.imooc.Java.CollectionMapUse.Sorting.TreeSetSorting.TreeSetObjectSorting;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 0:41
 * @注释：
 */
public class People {
    public String name;
    public int arg;

    public People() {
    }

    public People(String name, int arg) {
        this.name = name;
        this.arg = arg;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", arg=" + arg;
    }
}
