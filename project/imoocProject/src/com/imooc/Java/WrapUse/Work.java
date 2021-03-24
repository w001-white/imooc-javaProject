package com.imooc.Java.WrapUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/28 22:52
 * @注释：
 * Java在几种包装类中提供了缓存设计，会对一定范围内的数据作缓存，如果数据在范围内，会优先从缓存中取数据，超出范围才会创建新对象。其中:
 * Byte、Short、Integer、Long:缓存[-128，127]区间的数据
 * Character:缓存[0，127]区间的数据
 * Boolean:缓存true、false。
 * Double、Float并不支持。
 */
public class Work {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        // ==两边是对象的话，比较的是对象在内存的引用
        System.out.println("one==two?" + (one == two));

        // 自动装箱
        Integer three = 100;
        // 自动拆箱
        System.out.println("three==100?" + (three == 100));

        Integer four = 100;
        // valueOf()方法执行时，提供一个常量数组的缓存区（对象池），如果执行的时候，传进去的参数在-128<=参数<=127之间时，会查找对象池中是否
        // 存在这样一个对象，如果有，则直接产生，如果没有，就实例化Integer
        // 因此在调用four的时候，在对象池中存在three（100），所有three和four指向缓存区同一片空间
//        Integer four = Integer.valueOf(100);
        System.out.println("three==four?" + (three == four));

        Integer five = 200;
        System.out.println("five==200?" + (five == 200));

        Integer six = 200;
        System.out.println("five==six?" + (five == six));

        // 8种基本类型对应的的包装类，除了float和double外，都可以使用对象常量池的概念
        Double d1 = Double.valueOf(100);
        System.out.println("d1==100？" + (d1 == 100));

        Double d2 = Double.valueOf(100);
        System.out.println("d1==d2?"+(d1==d2));
    }
}
