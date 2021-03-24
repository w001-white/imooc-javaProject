package com.imooc.Java.ThreadUse.synchronization.work;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 10:06
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        Weather weather = new Weather();
        new Thread(new GenerateWeather(weather)).start();
        new Thread(new ReadWeather(weather)).start();
    }
}
