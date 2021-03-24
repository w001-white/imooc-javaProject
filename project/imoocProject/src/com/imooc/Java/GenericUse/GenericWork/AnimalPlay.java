package com.imooc.Java.GenericUse.GenericWork;

import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 15:03
 * @注释：
 */
public class AnimalPlay {
    public void AnimalPlay(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.play();
        }
    }

}
