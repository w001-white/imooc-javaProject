package com.imooc.Java.GenericUse.GenericWork;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 15:04
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        List<Dog> list1 = new ArrayList<>();
        Dog dog1 = new Dog();
        dog1.setName("巴蒂");
        list1.add(dog1);

        Dog dog2 = new Dog();
        dog2.setName("豆豆");
        list1.add(dog2);

        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.AnimalPlay(list1);

        List<Cat> list2 = new ArrayList<>();
        Cat cat1 = new Cat("花花");
        Cat cat2 = new Cat("凡凡");
        list2.add(cat1);
        list2.add(cat2);
        animalPlay.AnimalPlay(list2);
    }
}
