package com.imooc.Java.GenericUse.GenericCase;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 11:02
 * @注释： 泛型作为参数方法
 */
public class Test {
    public static void main(String[] args) {
        // 定义book的相关的list
        List<Goods> goods = new ArrayList<>();
        goods.add(new Book());
        goods.add(new Book());

        // 定义Clothes的相关的list
        List<Clothes> goods1 = new ArrayList<>();
        goods1.add(new Clothes());
        goods1.add(new Clothes());
//        goods1.add(new Book());

        // 定义Shoes的相关的list
        List<Shoes> goods2 = new ArrayList<>();
        goods2.add(new Shoes());
        goods2.add(new Shoes());

        /**
         *  方法一：
         *  此时会报错，原因是GoodsSell中的sellGoods方法传入参数为Goods类型，与Book类型不匹配，所以需要更换语句
         *   List<Book> goods = new ArrayList<>();为List<Goods> goods = new ArrayList<>();
         *   但此时与使用泛型所冲突，泛型的使用是为了限制输入的数据类型，此时改为Goods后，Book，Clothes，Shoes均可加入List中，不具备限制输入的功能
         */
        GoodsSell goodsSell = new GoodsSell();
        goodsSell.sellGoods(goods);

        /**
         * 方法二：
         * 改变GoodsSell中的sellGoods方法的参数列表
         */
        goodsSell.sellGoods(goods1);
        goodsSell.sellGoods(goods2);
    }
}
