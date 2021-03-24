package 观察者模式;

import java.util.ArrayList;

//气象站实现主题，发布气象信息（气温）
public class WeatherStation implements Subject{
    private ArrayList observers;
    private float temp;

    public WeatherStation() {
        // 加个ArrayList存放所有注册的Observer对象;
        observers = new ArrayList<>();System.out.println("sd1");
    }

    @Override
    public void registerObserver(Observer o) {
        // 当新的观察者注册时添加进来
        observers.add(o);System.out.println("sd2");
    }

    @Override
    public void removeObserver(Observer o) {
        // 当观察者取消注册时去除该观察者
        int i = observers.indexOf(o);
        if (i>=0) {
            observers.remove(i);
        }System.out.println("sd3");
    }

    @Override
    public void notifyObserver() {System.out.println("sd4");
        // 更新状态，调用Observer的update告诉观察者有新的信息
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temp);
        }
    }

    /*
     *  此方法用于气象站收到的数据,并且调用更新使数据实时通知给观察者
     */
    public void setMeasurements(float temp){System.out.println("sd5");
        this.temp = temp;
        System.out.println("气象站测量的温度为：" + temp + "℃");
        notifyObserver();
    }
}
