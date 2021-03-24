package 简单工厂;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sell {
//    public Sell() {
//        IceCreamstore iceCreamstore = null;
//        String OrderIceCream;//订购冰激凌的类型
//        do {
//            OrderIceCream = getType();
//            if (OrderIceCream.equals("AppleCream")) {
//                iceCreamstore = new AppleCream();//A a = new B();父类引用指向子类对象
//                iceCreamstore.setName("AppleCream");
//            }
//            else if (OrderIceCream.equals("OrangeIceCream")){
//                iceCreamstore = new OrangeIceCream();
//                iceCreamstore.setName("OrangeIceCream");
//            }
//            else if (OrderIceCream.equals("BananaCream")) {
//                iceCreamstore = new BananaCream();
//                iceCreamstore.setName("BananaCream");
//            }
//            else break;
//            iceCreamstore.Prepare();
//            iceCreamstore.Make();
//            iceCreamstore.Send();
//        } while (true);
//    }


    //构造器
    public Sell(SimpleFactory simpleFactory){
        setIceCreamFactory(simpleFactory);
    }

//定义一个简单工厂对象
    SimpleFactory simpleFactory;
    IceCreamstore iceCreamFactory = null;
    public void setIceCreamFactory(SimpleFactory simpleFactory){
        String orderType="";//用户输入
        this.simpleFactory=simpleFactory;//设置简单工厂对象

        do {
            orderType=getType();
            iceCreamFactory=this.simpleFactory.createIceCream(orderType);

            //输出冰激凌
            if (iceCreamFactory!=null){
                iceCreamFactory.Prepare();
                iceCreamFactory.Make();
                iceCreamFactory.Send();
            }else {
                System.out.println(" 订购失败 ");
                break;
            }
        }while (true);
    }

    //动态获取用户需要冰激凌口味
    private String getType(){
        try{
            System.out.println("请输入你想吃的冰激凌口味");
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));new InputStreamReader(System.in);
            /*new InputStreamReader(System.in);构造一个InputStreamReader对象，这个对象是字节流通向字符流的桥梁，它读取字节并将其解码为字符。

            new BufferedReader(new InputStreamReader(System.in));
            构造一个BufferedReader，里面存放在控制台输入的字节转换后成的字符。

            所以
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            拆开写就是：
            InputStream in  = System.in ;//键盘输入流
            InputStreamReader isr = new InputStreamReader(in);//字节流转换为字符流
            BufferedReader br = new BufferedReader(isr);//把字符流添加到缓冲流

            获取内容
                    str=br.readLine();
            从BufferedReader对象中读取一行的内容*/
            String str=strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
