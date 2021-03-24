package 单例模式懒汉1;

public class 懒汉 {
    public static void main(String args[]){
        System.out.println("懒汉式,线程不安全");//在多线程下，一个线程进入if判断语句块，还未来得及实例化，此时另一个线程也进入
                                              //该判断语句，则会产生多个实例化对象，在实际开发中，不要使用该方式
        Singleton instance=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance==instance2);
        System.out.println("instance.hashCode"+instance.hashCode());
        System.out.println("instance2.hashCode"+instance2.hashCode());
    }

    static class Singleton{
        private static Singleton instance;
        private Singleton(){}

        public static Singleton getInstance(){
            if(instance==null){
                instance=new Singleton();
            }
            return instance;
        }
    }
}
