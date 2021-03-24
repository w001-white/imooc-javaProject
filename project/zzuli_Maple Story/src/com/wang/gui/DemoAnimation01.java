package com.wang.gui;

import com.wang.until.FrameUntil;

import java.awt.*;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/11/25 21:51
 */
public class DemoAnimation01 extends MyFrame {
    public int x = 100;
    public int y = 100;

    @Override
    public void loadFrame() {
        super.loadFrame();
        // 子类所有的方法
        // 设置标题
        this.setTitle("动画01");
    }
    Image earth = FrameUntil.getImage("1.png");

    @Override
    public void paint(Graphics g) {
         g.drawImage(earth,x,y,null);
         x +=5;
         y +=2;
    }

    public static void main(String[] args) {
        new DemoAnimation01().loadFrame();
    }
}
