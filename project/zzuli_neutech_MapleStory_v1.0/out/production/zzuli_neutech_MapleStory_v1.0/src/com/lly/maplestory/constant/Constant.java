package com.lly.maplestory.constant;

import java.io.IOException;
import java.util.Properties;

/**
 * 存放项目中所有的常量
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/11/30 12:50
 */
public class Constant {

    /***
     * 存放属性配置的类
     */
    private static Properties props = new Properties();
    static {
        try {
            props.load(Constant.class.getClassLoader().getResourceAsStream("maplestory.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * 窗口的宽度
     */
    public static final int GAME_WIDTH = Integer.parseInt(props.getProperty("GAME_WIDTH"));
    /**
     * 窗口的高度
     */
    public static final int GAME_HEIGHT = Integer.parseInt(props.getProperty("GAME_HEIGHT"));
    /**
     * 项目名称标题
     */
    public static final String TITLE = props.getProperty("TITLE");
    /**
     * 图片路径前缀
     */
    public static final String IMG_PRE =  props.getProperty("IMG_PRE");
    /**
     * 图片路径后缀
     */
    public static final String IMG_AFTER = props.getProperty("IMG_AFTER");
    /**
     * 跳跃的初速度
     */
    public static final double INIT_JUMP_V0 = Double.parseDouble(props.getProperty("INIT_JUMP_V0"));

    /**
     * 英雄的速度
     */
    public static  final int HERO_SPEED = Integer.parseInt(props.getProperty("HERO_SPEED"));

    /**
     * 弓箭的速度
     */
    public static  final int ARROW_SPEED = Integer.parseInt(props.getProperty("ARROW_SPEED"));
    /**
     * 倒计时
     */
    public static final int TIME_OUT =Integer.parseInt(props.getProperty("TIME_OUT"));


}
