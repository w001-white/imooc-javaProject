package com.imooc.Java.DownPolymorphicUse.Test;

import com.imooc.Java.DownPolymorphicUse.Chinese.Chinese;
import com.imooc.Java.DownPolymorphicUse.French.French;
import com.imooc.Java.DownPolymorphicUse.Person.Person;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/21 23:14
 * @注释： 向下转型的有什么用处?直接创建子类对象不是更方便?
 *        向下转型一般是为了重新获得因为向上转型而丢失的子类特性而存在，因此，通常在向下转型前需要先进行向上转型，向下转型通常也会结合instanceof一起应用。
 */

public class Test {
    // 此时如需在测试类eatTest方法中，修改eatTest，实现针对传入不同的参数分别调用各自独立方法，则可以参考如下代码
    // 由此可见，借由向下转型，可以在灵活应用多态的基础上，同时兼顾子类的独有性，相较于直接创建子类实例，提高了代码加灵活性。
    public void eatTest(Person person) {
        if(person instanceof Chinese)
            ((Chinese)person).sport();
        else if(person instanceof French)
            ((French)person).sport();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.eatTest(new Chinese());
        test.eatTest(new French());
    }
}
