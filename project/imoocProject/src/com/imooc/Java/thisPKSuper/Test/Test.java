package com.imooc.Java.thisPKSuper.Test;

import com.imooc.Java.thisPKSuper.son.Son;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 23:44
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 因为，当子类的带参构造方法调用this (，意思是，调用了同类中的无参构造方法,
         * 而在子类的无参构造方法中如果没有通过super设定，则默认会调用其父类的无参构造方法，
         *     也就是编译器会自动在子类无参构造方法中添加super()。
         * this:当前类对象的引用
         * -访问当前类的成员方法
         * -访问当前类的成员属性
         * -访问当前类的构造方法
         * -不能在静态方法中使用
         * -构造方法中使用this()表示当前类中的无参构造方法，必须放在第一行
         * -构造方法中使用this(参数1，参数2….) 表示当前类中的有参构造方法，必须放在第一行
         * super:父类对象的引用
         * -访问父类的成员方法
         * -访问父类的成员属性
         * -访问父类的构造方法
         * -不能在静态方法中使用
         * -构造方法中使用super()表示父类中的无参构造方法，必须放在第一行
         * -构造方法中使用super(参数1，参数2….) 表示父类中的有参构造方法，必须放在第一行
         */
        Son son = new Son("son");
        son.aa();
    }


}
