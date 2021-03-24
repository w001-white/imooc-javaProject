package com.imooc.Java.animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/6 17:01
 * @注释：
 */
public class Cat {
    /**
     * 构造方法可以在构造方法之间调用，无参调用方法this();有参调用方法this(参数1.。。。。);
     * 无参构造方法
     * 1、构造方法必须和类名同名且没有返回值，且不可缺省
     * 2、语句格式public 构造方法名（）{}，与普通方法区别是没有返回值，名字必须和类名相同
     * 3、只能在对象实例化的时候调用，即必须和new搭配
     * 4、当没有指定构造方法时，系统会自动添加无参的构造方法
     * 5、当有指定的构造方法，无论有参、无参的构造方法，都不会自动添加无参构造方法
     * 6、一个类中可以具有多个构造方法
     */
    public Cat(){
        // 如果在代码调试时，希望进入构造方法内部，需要在对应的构造方法上设置断点
        System.out.println("我是无参构造方法");
    }

    /**
     * 有参构造方法
     */
    public Cat(String name, int month, double weight, String sort){
//        System.out.println("---------------");
        this();

        this.name = name;
        this.month = month;
        this.weight = weight;
        this.sort = sort;
        System.out.println(name + month + weight + sort);
        // 构造方法中也可以调用成员方法
//        run();
    }

    public Cat(int a){
        this("花花", 1, 2.0, "命名");
    }

    /**
     * 不推荐使用和类名相同的方法名
     */
//    public void Cat(){
//        System.out.println("我是一个普通方法，只是恰好叫Cat");
//    }

    //成员属性
    /**
     * 小猫的昵称
     */
    String name;
    /**
     * 小猫的年龄
     */
    int month;
    /**
     * 小猫的体重
     */
    double weight;
    /**
     * 小猫的品种
     */
    String sort;

    //成员方法
    /**
     * 跑动
     */
    public void run(){
        System.out.println("小猫快跑");
        System.out.println(name);
    }

    public void run(String name){
        System.out.println(name + "快跑");
    }
    /**
     * 吃东西
     */
    public void eat(){
        System.out.println("小猫吃鱼");
    }
}
