package 观察者模式;
//布告板上的状态显示
public class ConditionDisplay implements Observer,DisplayElement{
    private float temp;
    private Subject weatherStation;

    public ConditionDisplay(Subject weatherStation) {System.out.println("sd6");
        // 构造时需要间主题/被观察者对象作为注册之用
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void display() {System.out.println("sd7");
        // 将数据显示在布告板上
        System.out.println("布告板显示当前温度为：" + temp + "℃");
    }

    @Override
    public void update(float temp) {System.out.println("sd8");
        // 接受来自主题/被观察者（气象站）的数据
        this.temp = temp;
        display();
    }
}