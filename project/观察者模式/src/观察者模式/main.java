package 观察者模式;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        boolean m=true;
        while(m){
            Scanner a=new Scanner(System.in);
            System.out.print("气象台输入此时的气温：");
            int aa=a.nextInt();
            if(aa==0){
                m=false;
                break;
            }
            // 首先创建一个被观察者
            WeatherStation weatherStation = new WeatherStation();
            // 创建观察者并将被观察者对象传入
            ConditionDisplay conditionDisplay = new ConditionDisplay(weatherStation);

            // 设置气象站模拟收到的气温数据
            weatherStation.setMeasurements(aa);
        }
    }
}
