package com.imooc.Java.upPolymorphicUse.Test;

import com.imooc.Java.upPolymorphicUse.Chinese.Chinese;
import com.imooc.Java.upPolymorphicUse.French.French;
import com.imooc.Java.upPolymorphicUse.Person.Person;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 23:14
 * @注释： 向上转型的有什么用处?直接创建子类对象不是更方便?
 *        采用向上转型设置的方案更加简单灵活。如后续再新增加新的子类，也无需新增eatTest方法，非常方便。
 */

// 方案1:创建eatTest方法，设置参数为父类类型，利用向上转型，在main方法中调用时，分别直接传入子类即可。
public class Test {
    public void eatTest(Person person) {
        person.eat();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.eatTest(new Person());
        test.eatTest(new Chinese());
        test.eatTest(new French());
    }

    // 方案2∶分别设置2个eatTest的重载方法，分别设置参数为: Chinese、French、Russian，main方法不变，运行结果也与方案1相同。
    public void eatTest(Chinese person) {
        person.eat();
    }
    public void eatTest(French person) {
        person.eat();
    }

}
