package 单例模式懒汉2;

public class 懒汉 {
    public static void main(String args[]){
        System.out.println("懒汉式,线程控制synchronized ");
        Singleton instance= Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance==instance2);
        System.out.println("instance.hashCode"+instance.hashCode());
        System.out.println("instance2.hashCode"+instance2.hashCode());
    }

    static class Singleton{
        private static Singleton instance;
        private Singleton(){}

        public static synchronized Singleton getInstance(){//加入synchronized，加入同步代码，后续线程进行排队
                                                         //缺点是方法同步效率变低，不推荐
            if(instance==null){
                instance=new Singleton();
            }
            return instance;
        }
    }
}
