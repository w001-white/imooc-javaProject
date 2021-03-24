package com.wang.solar.util;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 *  静态加载项目中的所有图片
 * @author wang
 * @Version 1.0
 * @date 2020/11/28 23:23
 */
public class ImageUtil {
    private static Map<String, Image> images = new HashMap<>();
    static {
        images.put("bg", GameUntil.getImage("background.jpg"));
        images.put("Sun", GameUntil.getImage("sun.png"));
        images.put("Mercury", GameUntil.getImage("Mercury.png"));
        images.put("Venus", GameUntil.getImage("Venus.png"));
        images.put("earth", GameUntil.getImage("Earth.png"));
        images.put("moon", GameUntil.getImage("moon.png"));
        images.put("Mars", GameUntil.getImage("Mars.png"));
        images.put("Jupiter", GameUntil.getImage("jupiter.png"));
        images.put("Saturn", GameUntil.getImage("Saturn.png"));
        images.put("Uranus", GameUntil.getImage("Uranus.png"));
        images.put("Neptune", GameUntil.getImage("Neptune.png"));
        images.put("Pluto", GameUntil.getImage("Pluto.png"));
        images.put("Halley", GameUntil.getImage("Mars.png"));
        images.put("smallPlanet", GameUntil.getImage("min.png"));
        images.put("JupiterPlanet", GameUntil.getImage("min.png"));
    }

    public  static Image getImage(String key){
        return images.get(key);
    }
}
