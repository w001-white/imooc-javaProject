package 对象适配器;

import 类适配器.类适配器;

public class 对象适配器 {
    public static void main(String args[]){
        Adaptee adaptee=new Adaptee();
        Adapter adapter=new Adapter(adaptee);
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }


    // 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
    public static class Adaptee {
        public void sampleOperation1() {
            System.out.println("我是需要被继承的。");
        }
    }


    // 目标接口，或称为标准接口
    interface Target {
        public void sampleOperation1();
        public void  sampleOperation2();
    }


    public static class Adapter implements Target{
        private Adaptee adaptee;

        public Adapter(Adaptee adaptee){
            this.adaptee=adaptee;
        }

        @Override
        public void sampleOperation1() {
            adaptee.sampleOperation1();
        }

        @Override
        public void sampleOperation2() {
            System.out.println("我是新添加的。");
        }
    }
}
