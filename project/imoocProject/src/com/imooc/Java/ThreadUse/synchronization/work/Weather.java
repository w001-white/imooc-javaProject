package com.imooc.Java.ThreadUse.synchronization.work;

import java.util.Random;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 10:03
 * @注释： 天气
 */
public class Weather {
    // 温度
    private int temperature;
    // 湿度
    private int humidity;
    boolean flag = true;

    public Weather() {
    }

    public Weather(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    // 随机生成天气数据
    public void generate() {
        // 通过Random获取0-40随机数
        Random random = new Random();
        int tp = random.nextInt(41);
        setTemperature(tp);

        // 通过Math.random()来获取随机数[0,1)
        int hu = (int) ((Math.random()) * 100);
        setHumidity(hu);
    }

    // 读取天气数据
    public synchronized void read() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        notifyAll();
        System.out.println("读取天气数据：温度=" + getTemperature() + "湿度=" + getTemperature());
    }

    @Override
    public synchronized String toString() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        notifyAll();
        return "生成天气数据：温度=" + getTemperature() + "湿度=" + getTemperature();
    }
}
