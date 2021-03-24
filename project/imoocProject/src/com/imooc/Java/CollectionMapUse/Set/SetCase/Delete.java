package com.imooc.Java.CollectionMapUse.Set.SetCase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/16 21:06
 * @注释：
 */
public class Delete {
    public Delete() {

    }

    // 此时只能删除一个，
    public Delete(Set set) {
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            Cat c = it.next();
            if (c.getName().equals("花花01")) {
                set.remove(c);
                break;
            }
        }
    }

    // 删除所有的信息
    public void Delete(Set set) {
        // removeAll(set);中set可以是set也可以是set的一个子集，例子如下
        boolean flag = set.removeAll(set);
        if (flag) {// if(set.isEmpty()){
            System.out.println("所有的猫都不见了");
        } else {
            System.out.println("删除失败");
        }
    }

    // 删除一部分的数据
    public void Delete1(Set set) {
        Set<Cat> set1 = new <Cat>HashSet();
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            Cat c = it.next();
            if (c.getMonth()<3) {
                set1.add(c);
            }
        }
        set.removeAll(set1);
    }
}
