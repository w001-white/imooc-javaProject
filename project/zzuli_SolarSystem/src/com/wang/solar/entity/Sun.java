package com.wang.solar.entity;

import com.wang.solar.constant.Constant;
import com.wang.solar.util.GameUntil;
import com.wang.solar.util.ImageUtil;

import java.awt.*;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/11/26 13:13
 */
public class Sun extends Star{

    /**
     *  构造太阳
     */
    public Sun(){
        this.img = ImageUtil.getImage("Sun");
        this.width = this.img.getWidth(null);
        this.hight = this.img.getHeight(null);
        this.x = Constant.GAME_WIDTH / 8 - this.width/2;
        this.y = Constant.GAME_HEIGHT / 2 - this.hight/2;
        this.name = "太阳";
    }

    public Sun(String name){
        this();// 调用本类的其它方法，必须在第一行
        this.name = name;
    }

    /**
     *  移动的方法
     */
    @Override
    public void move() {

    }


    @Override
    public void draw(Graphics g){
        g.drawImage(img,x,y,null);
    }
}
