package com.imooc.Java.GenericUse.GenericCase;

import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 11:00
 * @注释：
 */
public class GoodsSell {
    /**
     * 变参数类型List<Goods> goods为List<? extends Goods> goods
     * 意思是只要此时传入的参数为Goods或者其子类都可以
     * @param goods
     */
    public void sellGoods(List<? extends Goods> goods) {
        // 调用集合中的sell方法
        for (Goods goods1 : goods) {
            goods1.sell();
        }
    }
}
