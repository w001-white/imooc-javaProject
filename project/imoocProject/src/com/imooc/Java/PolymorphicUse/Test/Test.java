package com.imooc.Java.PolymorphicUse.Test;

import com.imooc.Java.PolymorphicUse.Animal.Animal;
import com.imooc.Java.PolymorphicUse.Cat.Cat;
import com.imooc.Java.PolymorphicUse.Dog.Dog;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 22:19
 * @注释： 多态的使用：向上转型，父类引用指向子类
 *        向下转型，子类指向父类
 *        抽象类(abstract):不允许实例化，可以通过向上转型,指向子类实例
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        /**
         * 向上转型、隐式转型、自动转型:父类类型 父类引用= new 子类类型(参数);
         * 小类转型为大类
         * 该引用只能访问子类继承或重写父类的方法，而不能直接访问子类特有的方法。
         * 向上转型多适用于，有多个同父子类共同应用的场景，此时，可以借由父类引用，根据实际需要，转型为特定的了类对象实现多态。
         */

        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        cat.eat();
        // 可以调用父类中的方法
        cat.setMonth(1);
        // 无法使用自己特有的方法
//        cat.run();
        dog.eat();

        /**
         * 向下转型、强制类型转换
         * 子类引用指向父类对象，此处必须进行强转，可以调用子类特有的方法
         * instanceof运算符（对象 instanceof 类）：返回true(对象可以实例化类)/false(对象不可以实例化类)
         */
        System.out.println("=============================");
        Animal cat1 = new Cat();
        if (cat1 instanceof Animal) {
            Cat temp = (Cat) cat1;
            temp.run();
            temp.eat();
            temp.setMonth(1);
            System.out.println("cat1可以转换从Cat类型");
        }
        if (cat1 instanceof Dog) {
            Dog temp2 = (Dog) cat1;
            temp2.eat();
            temp2.setMonth(1);
            System.out.println("cat1可以转换成Dog类型");
        }
    }
}
