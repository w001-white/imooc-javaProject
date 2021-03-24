package com.imooc.Java.staticUse.静态方法;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/15 22:58
 * @注释：
 * 静态方法:用static修饰的成员方法，通常也称为静态方法、类方法、全局方法等。
 * 非静态方法:没有被static修饰的成员方法，也称为叫做非静态方法、实例方法，对象方法等。
 * 与静态成员相似，静态方法属于整个类的，由类所进行维护，优先于对象而存在，因此可以通过类名和对象名两种方式访问，
 * 也因此在静态方法中无法直接访问同类中的非静态成员。
 */
public class CarDemo {
    static String firm; //厂商
    String color; //车的颜色

    public CarDemo(String color) {
        this.color = color;
    }

    public static void display() {
//        错误提示:不能在静态方法中应出现this关键字
//        System.out.println("厂商是：" + firm + "车的颜色是：" + this.color);

//        错误提示:不能在静态方法中应出现非静态成员
//        System.out.println("厂商是：" + firm + "车的颜色是：" + color);

        // 修订
        // 1、静态方法中可以通过"类名.成员"或"成员"的方式访问类内静态成员/静态方法
        // 2、不允许直接访问本类中的非静态成员/非静态方法
        // 3、可以通过实例化产生本类对象，通过"对象.成员"的方式访问类内非静态成员/非静态方法。
        System.out.println("厂商是：" + firm);
        System.out.println("厂商是：" + CarDemo.firm);
        CarDemo carDemo = new CarDemo("蓝色");
        System.out.println("车的颜色是：" + carDemo.color);

//        错误提示: test前的static修饰符无效，即不允许在方法内定义静态变量。
//        static int app;
        int app;

        // 静态方法不可以直接访问非静态方法，只能直接调用静态方法
//        run();
        CarDemo carDemo1 =new CarDemo("紫色");
        //carDemo1.run();
        carDemo1.color = "粉色";

        // 静态方法中不能使用this
//        this.firm = "asd";
//        this.color = "fds";
        firm = "sads";
    }

    public void run() {
        // 1、非静态方法可以通过“类名.成员法"或~成员"或"this.成员"的方式访问类内静态成员/静态方法
        // 2、应用“this.静态成员/静态方法"时会出现警告，但不影响程序运行。
        // 类内静态成员访问方式1:类名.成员名
        System.out.println("厂商是：" + CarDemo.firm); //同理可以CarDemo.display()
        // 类内静态成员访问方式2:成员名
        System.out.println("厂商是：" + firm); //同理可以display()
        // 类内静态成员访问方式3:this.成员名
        System.out.println("厂商是：" + this.firm + this.color); //同理可以this.display()
        // 非静态方法可以直接访问静态方法
        //CarDemo.display();

//        错误提示: test前的static修饰符无效，即不允许在方法内定义静态变量。
//        static int aapp;
        int aapp;
    }
}
