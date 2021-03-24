package 简单工厂;

public class SimpleFactory {
    //根据iceCreamFactory返回一个对应的冰激凌类型
    public IceCreamstore createIceCream(String OrderIceCream) {//public 类名 方法名(){}返回类型是IceCreamstore这个类的实例（对象）。
                                                           // 可以通过类名+方法名调用的方法叫做静态方法
        System.out.println("使用简单工厂模式");
        IceCreamstore iceCreamstore = null;
        if (OrderIceCream.equals("AppleCream")) {
            iceCreamstore = new AppleCream();//A a = new B();父类引用指向子类对象
            iceCreamstore.setName("AppleCream");
        }
        else if (OrderIceCream.equals("OrangeIceCream")){
            iceCreamstore = new OrangeIceCream();
            iceCreamstore.setName("OrangeIceCream");
        }
        else if (OrderIceCream.equals("BananaCream")) {
            iceCreamstore = new BananaCream();
            iceCreamstore.setName("BananaCream");
        }
        return iceCreamstore;
    }
}


