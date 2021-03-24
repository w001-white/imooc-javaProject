package 简单工厂;

public class main {
    public static void main(String arg[]){
        new Sell(new SimpleFactory());
        System.out.println("~~退出程序~~");
    }
}
