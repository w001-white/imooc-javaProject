package com.imooc.Java.CollectionMapUse.MapUse.MapCase;

import java.util.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/24 11:17
 * @注释： 通过Map实现对商品信息的增删改查
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 定义HashMap，其中key值唯一
        Map<String, Goods> goodsMap = new HashMap<String, Goods>();
        System.out.println("请输入三条商品信息");
        int i = 0;
        while (i < 3) {
            System.out.println("请输入第" + (i + 1) + "条商品信息：");
            System.out.print("请输入商品编号：");
            String GoodsId = scanner.next();

            // 判断key值是否存在
            if (goodsMap.containsKey(GoodsId)) {
                System.out.println("商品编号重复，请重新输入");
                continue;
            }

            System.out.print("请输入商品名称：");
            String GoodsName = scanner.next();

            System.out.print("请输入商品价格：");
            double GoodsPrice = 0;
            // 进行异常判断
            try {
                GoodsPrice = scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("商品的价格格式错误，请重新输入");
                /**
                 * 需要重新输入信息，否则会在商品编号的时候，读取此次输入的错误信息为商品编号
                 * 因为此次输入的内容此次未被调用，直接会被下一次next调用
                 */
                scanner.next();
                continue;
            }


            Goods goods = new Goods(GoodsId, GoodsName, GoodsPrice);
            // 将商品信息添加到Map中
            goodsMap.put(GoodsId, goods);
            i++;
        }

        System.out.println("商品的所有的信息：");
        // 输出方法一：使用迭代器输出
//        Iterator<Goods> iterator = goodsMap.values().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        // 方法二：使用for循环输出
        for (Goods goods : goodsMap.values()) {
            System.out.println(goods);
        }

//        // 方法三：使用entrySet输出
//        Set<Map.Entry<String, Goods>> entrySet = goodsMap.entrySet();
//        for (Map.Entry<String, Goods> entry : entrySet) {
//            // 则会传入key与value的值，输出的时候为key+value（toString方法的输出格式）
//            // id=商品编号:id, 商品名称:name, 商品价格:price
////            System.out.println(entry);
//            System.out.println(entry.getValue());
//        }
    }
}
