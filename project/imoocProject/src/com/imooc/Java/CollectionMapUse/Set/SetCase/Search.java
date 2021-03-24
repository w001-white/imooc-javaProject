package com.imooc.Java.CollectionMapUse.Set.SetCase;

import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/16 19:23
 * @注释： 查询猫
 * 泛型：强调传入的数据类型，优点是使用其它数据类型的参数时会报错；
 *      不用进行强制类型转换，例如Object强制转换
 */
public class Search {
    public Search(){

    }
    public void Search(Set set, Cat cat1) {
        // 查找信息
        // 使用对象查找
        System.out.println("使用对象查找");
        if (set.contains(cat1)) {
            System.out.println("花花找到了");
            System.out.println(cat1);
        } else {
            System.out.println("花花没找到");
        }
        System.out.println("=======================");
    }

    public void Search(Set set, String name) {
        Iterator<Cat> it = set.iterator();
        // 使用名字查找
        System.out.println("使用名字查找");
        boolean flat = false;
        Cat c = null;
        while (it.hasNext()) {
            // 泛型的好处是去掉强制类型转换
//            c = (Cat) (it.next());
            c = it.next();
            if (c.getName().equals(name)) {
                flat = true;// 找到了
                break;
            }
        }
        if (flat == true) {
            System.out.println("花花找到了");
            System.out.println(c);
        } else {
            System.out.println("花花没找到");
        }
        System.out.println("=======================");
    }
}
