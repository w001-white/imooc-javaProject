package com.imooc.Java.abstractuse.Test;

import com.imooc.Java.abstractuse.Animal.Animal;
import com.imooc.Java.abstractuse.Cat.Cat;
import com.imooc.Java.abstractuse.Dog.Dog;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 22:19
 * @注释 抽象类(abstract):不允许实例化，可以通过向上转型,指向子类实例
 *       final  static   private不能与抽象修饰符搭配
 */
public class Test {
    public static void main(String[] args) {
        // 不允许abstract类型实例化
//        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.eat();
        dog.eat();

        // sheep也是抽象类，解释看Animal抽象方法注解
//        Animal sheep = new Sheep();
    }
}
