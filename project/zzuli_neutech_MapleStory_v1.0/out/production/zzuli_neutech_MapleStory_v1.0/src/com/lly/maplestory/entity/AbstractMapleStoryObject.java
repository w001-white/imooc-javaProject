package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.util.MapleStoryUtil;

import java.awt.*;
import java.util.Random;

/**
 * 项目中所有项目类都要继承此抽象类
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/11/30 18:52
 */
public abstract class AbstractMapleStoryObject implements Drawable, Moveable{
    /**
     * 图片对象
     */
    public Image img;
    /**
     * 横坐标
     */
    public int x;
    /**
     * 纵坐标
     */
    public int y;
    /**
     * 对象的宽度
     */
    public int width;
    /**
     * 对象的高度
     */
    public int height;
    /**
     * 中介者设计模式
     */
    public MapleStoryClient msc;
    /**
     * 对象的速度
     */
    public int speed;
    /**
     * 表示方向的枚举类型
     */
    public Direction dir;
    /**
     * 表示动作的枚举类型
     */
    public Action action;
    //怪物名字
    public String name;
    //等级
    public int level;
    //血量
    public int HP;
    //魔法
    public int MP;
    //经验值
    public int EXP;
    //生死
    public boolean live = true;

    public static Random r = new Random();

    @Override
    public void draw(Graphics g) {
        g.drawImage(img,x,y,null);

        move();
    }

    public Rectangle getRectangle(){
        return null;
    }
    public void move(){

    }
}
