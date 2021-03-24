package com.wang.gui;

import com.wang.until.FrameUntil;

import java.awt.*;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/11/25 23:17
 */
public class DemoAnimation03 extends MyFrame {
    @Override
    public void loadFrame() {
        super.loadFrame();
        this.setTitle("圆周运动");
    }

    public int x = 100;
    public int y = 100;
    public  int longAxis = 300;
    public  int shortAxis = 100;
    public  double theta = 0.0;
    public  double speed = 0.1;
    Image earth = FrameUntil.getImage("1.png");

    /**
     *  小球的宽度
     */
    int w = earth.getWidth(null);

    /**
     *  小球的高度
     */
    int h = earth.getHeight(null);
    @Override
    public void paint(Graphics g) {
        g.drawImage(earth,x,y,null);
        // 椭圆的轨迹方程
        x = Constant.GAME_WIDTH/2 + (int)(longAxis * Math.cos(theta)) - w/2;
        y = Constant.GAME_HEIGHT/2 + (int)(longAxis * Math.sin(theta)) - h/2;
        theta += speed;
    }

    public static void main(String[] args) {
        new DemoAnimation03().loadFrame();
    }
}
