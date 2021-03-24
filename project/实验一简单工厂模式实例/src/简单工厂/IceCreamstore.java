package 简单工厂;

public class IceCreamstore {
    String name;
    public void setName(String name){
        this.name=name;
    }

    public void Prepare(){
        System.out.println(name+" 正在准备原材料");
    }

    public void Make(){
        System.out.println(name+" 原材料就绪，准备制作"+name+"冰激凌");
    }

    public void Send(){
        System.out.println(name+" 正在派送，请注意查收");
    }
}

