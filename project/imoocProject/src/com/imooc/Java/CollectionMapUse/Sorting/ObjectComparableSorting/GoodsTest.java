package com.imooc.Java.CollectionMapUse.Sorting.ObjectComparableSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 22:55
 * @注释：
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("s001","gou",1.0);
        Goods goods2 = new Goods("s003","mao",3.0);
        Goods goods3 = new Goods("s002","zhu",2.0);
        List<Goods> list = new ArrayList<>();
        list.add(goods1);
        list.add(goods2);
        list.add(goods3);

        System.out.println("排序前：");
        for (Goods goods : list){
            System.out.println(goods);
        }

        System.out.println("按价格排序");
        Collections.sort(list);
        for (Goods goods : list){
            System.out.println(goods);
        }
    }
}
