package com.imooc.Java.InnerClassUse.AnonymousInnerClass.Test;

import com.imooc.Java.InnerClassUse.AnonymousInnerClass.People4.Man;
import com.imooc.Java.InnerClassUse.AnonymousInnerClass.People4.People;
import com.imooc.Java.InnerClassUse.AnonymousInnerClass.People4.Woman;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 10:41
 * @注释： 匿名内部类
 */
public class Test {

    public void getRead(People people) {
        people.read();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.getRead(new Man());
        test.getRead(new Woman());
        System.out.println("==========================");

        /**
         * 匿名内部类，假设当前Man以及Woman不存在
         * 场景：
         *      只用到类的一个实例类
         *      在定义后马上用到
         *      给类命名并不会导致代码更容易被理解
         *
         * 1、匿名内部类没有类型名称、实例对象名称
         * 2、编译后的文件命名:外部类$数字.class
         * 3、无法使用private、public. protected、abstract、 static修饰
         * 4、无法编写构造方法,可以添加构造代码块进行初始化
         * 5、不能出现静态成员
         * 6、匿名内部类可以实现接口也可以继承父类，但是不可兼得
         * 优点：
         *      可以少些一些类（Man和Woman）
         *      可以不用初始化，占用过多内存
         * 缺点：
         *      一个匿名内部类只能使用一次，不能重复调用
         *      若想再次使用，只能重新定义一个匿名内部类
         */

        test.getRead(new People() {
            {
                // 构造代码块
            }

//            public static int a = 10;
            int a = 10;

            @Override
            public void read() {
                System.out.println("男人喜欢读科幻小说");
            }
        });
        test.getRead(new People() {
            @Override
            public void read() {
                System.out.println("女生喜欢读言情类小说");
            }
        });
    }
}
