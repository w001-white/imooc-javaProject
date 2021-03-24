package 单例模式懒汉3;

public class 懒汉 {
    public static void main(String args[]){
        System.out.println("懒汉式,双重检查");
        Singleton instance= Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance==instance2);
        System.out.println("instance.hashCode"+instance.hashCode());
        System.out.println("instance2.hashCode"+instance2.hashCode());
    }

    static class Singleton{
        private static volatile Singleton instance;
        private Singleton(){}

        //加入双重检查代码，解决线程安全问题，同时解决懒汉加载问题
        public static synchronized Singleton getInstance(){//a,同时进入方法时，在第二个synchronized被拦截
            if(instance==null){
                synchronized (Singleton.class){
                    if(instance==null){
                        instance=new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}
