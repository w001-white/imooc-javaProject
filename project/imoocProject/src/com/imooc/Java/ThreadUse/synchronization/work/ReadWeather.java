package com.imooc.Java.ThreadUse.synchronization.work;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 10:06
 * @注释：
 */
public class ReadWeather implements Runnable {
    Weather weather;

    public ReadWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            weather.read();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
