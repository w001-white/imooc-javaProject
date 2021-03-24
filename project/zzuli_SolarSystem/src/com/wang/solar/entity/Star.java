package com.wang.solar.entity;

import java.awt.*;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/11/26 13:32
 */
public abstract class Star implements Drawable,Moveable{
    public int x;
    public int y;
    public String name;
    public Image img;
    public int longAxis;
    public int shortAxis;
    public double speed;
    public double theta;
    public int width;// 图片的宽
    public int hight;// 图片的高
    /**
     *  环绕中心
     */
    public Star center;
//
//    public abstract void move();
//
//    public abstract void draw(Graphics g);
}
