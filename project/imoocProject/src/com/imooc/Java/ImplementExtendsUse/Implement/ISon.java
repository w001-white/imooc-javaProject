package com.imooc.Java.ImplementExtendsUse.Implement;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/23 22:30
 * @注释：
 */

// 接口中可以实现继承多个接口，但是在实现类中需要重写所有的接口方法
// 如果是单继承，即子接口只有一个父接口，则可继承父接口中定义的常量、抽象方法、默认方法，无法继承静态方法
public interface ISon extends IFather1, IFather2 {
    public void play();

    // 若是两个接口中存在相同名字的默认方法，则在此接口中需要重写此方法

    @Override
    default void connection() {
        System.out.println("我是ISon中的connection");
    }
}
