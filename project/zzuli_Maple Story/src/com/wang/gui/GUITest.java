package com.wang.gui;

import com.sun.corba.se.spi.activation.EndPointInfo;
import com.wang.until.FrameUntil;

import java.awt.*;

/*
    生成窗口文件步骤
    1、继承Frame类
    2、重写paint(Graphic g)
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUITest extends MyFrame {

    /**
     *
     * @param g 画笔对象
     */

    @Override
    public void paint(Graphics g) {
        // 画线段
        g.drawLine(100,200,200,500);
        // 画矩形
        g.drawRect(100,100,400,280);
        // 画圆形
        g.drawOval(100,100,400,280);
        // 写字符串(字符串起点是字符串最左下角的位置)
        g.drawString("Hello",300,300);
        // 保存系统颜色
        Color c=g.getColor();

        // 修改画笔颜色
        g.setColor(new Color(255, 63, 234));

        // 不规则图形(上下对应是相应的点的坐标)
        int[] xPoints = {100,200,300,400};
        int[] yPoints = {520,180,260,170};
        g.drawPolygon(xPoints,yPoints, 4);

        // 还原回原来颜色
        g.setColor(c);
        // 写字符串(字符串起点是字符串最左下角的位置)
        g.drawString("world",120,120);

        // 画图片（此时图片在窗口正中间（窗口的长/2-图片的长/2，窗口的宽/2-图片的宽/2））
        g.drawImage(img,Constant.GAME_WIDTH/2 - imgWidth/2,Constant.GAME_HEIGHT/2 - imgHeight/2,null);
    }
    // 需把图片文件夹改成resources，file->project structure->modules->选择img文件夹->选择resources->OK(告诉idea，img中存储的是静态资源)
    Image img = FrameUntil.getImage("1.png");


    int imgWidth = img.getWidth(null);
    int imgHeight = img.getHeight(null);

    public static void main(String[] args) {
        new GUITest().loadFrame();
    }
}
