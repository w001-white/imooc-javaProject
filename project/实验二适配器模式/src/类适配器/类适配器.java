package 类适配器;

import jdk.nashorn.internal.runtime.linker.JavaAdapterServices;

public class 类适配器 {
    public static void main(String args[]){
        Target adp=new Adapter();
        adp.sampleOperation1();
        adp.sampleOperation2();
    }


    // 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
     static class Adaptee {
        public void sampleOperation1() {
            System.out.println("我是需要被继承的。");
        }
    }


    // 目标接口，或称为标准接口
    interface Target {
        public void sampleOperation1();
        public void  sampleOperation2();
    }



// 适配器类，继承了被适配类，同时实现标准接口(适配器接口)
static class Adapter extends Adaptee implements Target{
        public void  sampleOperation2() {
            System.out.println("我是新添加的。");
        }
    }
}
