package com.imooc.Java.GenericUse.GenericClassUse;


import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/26 16:10
 * @注释： 泛型方法的使用
 */
public class GenericMethod {
    // 泛型方法，不一定需要放到泛型类中
    public <T> void printValue(T t) {
        System.out.println(t);
    }

    

    // 此时只能输入Number以及其子类的类型
    public <T extends Number> void printValue1(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printValue("asd");
        genericMethod.printValue(1);
        genericMethod.printValue(1.0);
        genericMethod.printValue(1.0f);

        com.imooc.Java.CollectionMapUse.Set.SetCase.Cat cat = new com.imooc.Java.CollectionMapUse.Set.SetCase.Cat("花花", 2, "英短");
        List list = new ArrayList();
        list.add(cat);
        genericMethod.printValue(list);
    }
}
