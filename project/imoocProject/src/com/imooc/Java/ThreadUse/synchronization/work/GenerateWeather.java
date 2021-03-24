package com.imooc.Java.ThreadUse.synchronization.work;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 10:05
 * @注释：
 */
public class GenerateWeather implements Runnable {
    Weather weather;

    public GenerateWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            weather.generate();
            System.out.println(weather);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
