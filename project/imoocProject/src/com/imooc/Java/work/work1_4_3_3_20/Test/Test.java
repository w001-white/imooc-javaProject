package com.imooc.Java.work.work1_4_3_3_20.Test;

import com.imooc.Java.work.work1_4_3_3_20.Animal.Animal;
import com.imooc.Java.work.work1_4_3_3_20.Animal.Cat;
import com.imooc.Java.work.work1_4_3_3_20.Animal.Dog;
import com.imooc.Java.work.work1_4_3_3_20.Animal.Sheep;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/22 15:00
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        int n = 0;
        int i;
        Animal[] animal = new Animal[5];
        for (i = 0; i < animal.length; i++) {
            n = (int) (Math.random() * 3);
//            System.out.println(n);
            switch (n) {
                case 0:
                    animal[i] = new Cat();
                    break;
                case 1:
                    animal[i] = new Dog();
                    break;
                case 2:
                    animal[i] = new Sheep();
                    break;
            }
        }
//        System.out.println(i);
        Animal animal1 = new Animal();
        animal1.cry(animal);
    }
}
