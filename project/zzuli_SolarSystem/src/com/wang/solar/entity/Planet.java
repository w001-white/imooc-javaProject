package com.wang.solar.entity;

import com.wang.solar.client.SolarSystemClient;
import com.wang.solar.constant.Constant;
import com.wang.solar.util.GameUntil;
import com.wang.solar.util.ImageUtil;

import java.awt.*;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/11/26 22:49
 */
public class Planet extends Star{

    public boolean venus;
    public boolean smallPlant;
    public SolarSystemClient a;

    public Planet(){
        this.img = GameUntil.getImage("Earth.png");
        this.width = img.getWidth(null);
        this.hight = img.getHeight(null);
        this.longAxis = 400;
        this.shortAxis = 150;
        this.x = Constant.GAME_WIDTH / 2 + this.longAxis;
        this.y = Constant.GAME_HEIGHT / 2;
        this.y = 100;
        this.name = "地球";
        this.speed = 0.03;
        this.theta = 0.0;
    }

    // 除火星的运转
    public Planet(SolarSystemClient a, Star center, String key, String name, double AU, double e, int t){
        this.a = a;
        this.center = center;
//        this.img = GameUntil.getImage(imgName);
        this.img= ImageUtil.getImage(key);
        this.width = img.getWidth(null);
        this.hight = img.getHeight(null);

        this.name = name;// 行星名称
        this.longAxis = getlongAxis(AU);// 长轴： 天文单位
        this.shortAxis = getShortAxis(e);// 短轴： 离心率和长轴
        this.speed = getSpeed(t);
        this.theta = 0.0;

        this.x = this.center.x + this.center.width / 2 + this.longAxis - this.width / 2;
        this.y = Constant.GAME_HEIGHT / 2;
    }

    //小行星
    public Planet(SolarSystemClient a, Star center, boolean smallPlant, String key, String name, double AU, double e, int t){
        this(a, center, key, name, AU, e, t);
        this.smallPlant = smallPlant;
    }

    // 火星运转
    public Planet(SolarSystemClient a, Star center, String key, String name, double AU, double e, int t, boolean venus){
        this(a, center, key, name, AU, e, t);
        this.venus = venus;
    }

    private int getlongAxis(double AU){
            return (int)(100 * AU / 8);
    }

    private int getShortAxis(double e){
        return (int)(this.longAxis * Math.sqrt(1 - e * e));
    }

    private double getSpeed(int t){
        return 0.1 * 365 / t;
    }

    @Override
    public void draw(Graphics g) {
        // 先画轨道，其中小行星不画轨道
        if(!smallPlant)   drawTrace(g);
        // 再画行星
        g.drawImage(img,x,y,null);
        Color c = g.getColor();//黑色
        g.setColor(Color.white);
        Font f = g.getFont();
        g.setFont(new Font("微软雅黑",Font.BOLD,12));
        g.drawString(name,x,y - 2);
        g.setColor(c);
        g.setFont(f);
        move();

    }

    public void drawTrace(Graphics g){
        int x = (int)(this.center.x + this.center.width / 2 + Math.sqrt((longAxis * a.rate) * (longAxis * a.rate)  - (shortAxis *a.rate) * (shortAxis *a.rate)) - this.longAxis * a.rate);
        int y = this.center.y + this.center.hight / 2- this.shortAxis * a.rate;
        int width = 2 * this.longAxis * a.rate;
        int height = 2 * this.shortAxis * a.rate;

        Color c = g.getColor();//黑色
        g.setColor(Color.white);
        g.drawOval(x,y,width,height);
        g.setColor(c);
    }

    @Override
    public void move() {
        x = (int) (this.center.x + this.center.width / 2 + Math.sqrt((longAxis * a.rate) * (longAxis * a.rate)  - (shortAxis *a.rate) * (shortAxis *a.rate)) - this.width / 2 + longAxis * a.rate * Math.cos(theta));
        y = (int) (this.center.y + this.center.hight / 2 - this.hight / 2 + shortAxis * a.rate * Math.sin(theta));
        if(!venus){
            // 逆时针转
            this.theta -= speed;
        }else{
            this.theta += speed;
        }
    }
}
