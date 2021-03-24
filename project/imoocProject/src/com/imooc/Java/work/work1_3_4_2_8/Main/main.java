package com.imooc.Java.work.work1_3_4_2_8.Main;

import com.imooc.Java.work.work1_3_4_2_8.Father.Father;
import com.imooc.Java.work.work1_3_4_2_8.Programming.Programming;
import com.imooc.Java.work.work1_3_4_2_8.Test.Test;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 20:54
 * @注释：
 * 方法重载:
 * 1、同一个类中
 * 2、方法名相同,参数列表不同(参数顺序、个数、类型)
 * 3、方法返回值、访问修饰符任意
 * 4、与方法的参数名无关
 * 方法重写
 * 1、有继承关系的子类中
 * 2、方法名相同,参数列表相同(参数顺序、个数、类型)
 * 3、访问修饰符，访问范围需要大于等于父类的访问范围
 * 4、与方法的参数名无关
 */
public class main {
    public static void main(String[] args) {
        Father father = new Father("父", "开心工作");
        father.Describe();

        Test test = new Test(10, 5);
        test.setSort("测试工作");
        test.Describe();

        Programming programming = new Programming(1000, 10);
        programming.setSort("研发工作");
        programming.Describe();
    }
}
