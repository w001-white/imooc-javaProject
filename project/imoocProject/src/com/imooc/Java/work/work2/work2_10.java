package com.imooc.Java.work.work2;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/8 20:44
 * @注释：
 * 编写自定义猴子类
 * 程序参考运行效果图如下:
 * 我是使用无参构造产生的猴子︰
 * 名称:长尾猴
 * 特征∶尾巴长
 * =======================
 * 我是使用带参构造产生的猴子∶
 * 名称:白头叶猴
 * 特征∶头上有白毛，喜欢吃树叶
 *
 * 任务
 * 1、创建Monkey类
 *    属性:名称(name）和特征(feature)方法:
 *    1)无参构造方法（默认初始化name和feature的属性值，属性值参考效果图)
 *    2)带参构造方法，接收外部传入的参数，分别向name和feature赋值
 */
public class work2_10 {

    String name;
    String feature;

    public void Monkey(){
        name = "长尾猴";
        feature = "尾巴长";
        System.out.println("我是使用无参构造产生的猴子︰\n" + "名称：" + name + "\n特征∶" + feature);
    }

    public void Monkey(String name, String feature){
//        this.name = name;
//        this.feature = feature;
        System.out.println("我是使用有参构造产生的猴子︰\n" + "名称：" + name + "\n特征∶" + feature);
    }

    /**
     * 去掉无参构造方法的赋值时，在main方法中运行输出语句时，输出结果为
     * 名称：长尾猴
     * 特征∶尾巴长
     * 因为在无参构造方法中，已经默认为成员变量进行赋值
     */
    public static void main(String[] args) {
        work2_10 work2_10 = new work2_10();
        work2_10.Monkey();
        System.out.println("我是使用有参构造产生的猴子︰\n" + "名称：" + work2_10.name + "\n特征∶" + work2_10.feature);
        System.out.println("=======================");
        work2_10.Monkey("白头叶猴","头上有白毛，喜欢吃树叶");
        System.out.println("我是使用有参构造产生的猴子︰\n" + "名称：" + work2_10.name + "\n特征∶" + work2_10.feature);
    }
}
