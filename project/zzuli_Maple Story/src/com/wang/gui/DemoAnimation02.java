package com.wang.gui;

import com.wang.until.FrameUntil;

import java.awt.*;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/11/25 22:34
 */
public class DemoAnimation02 extends  MyFrame {
    @Override
    public void loadFrame() {
        super.loadFrame();
        this.setTitle("水平往返运动");
    }

    public int x = 100;
    public int y = 100;
    /**
     *  小球的速度
     */
    public int speed = 10;
    Image earth = FrameUntil.getImage("1.png");

    /**
     *  小球的宽度
     */
     int w = earth.getWidth(null);

    /**
     *  小球的高度
     */
    int h = earth.getHeight(null);

    /**
     *  使用开关
     */
    public boolean right = true;

    @Override
    public void paint(Graphics g) {
        g.drawImage(earth,x,y,null);

        if(right){
            x += speed;
        }else{
            x -= speed;
        }
        if(x >= Constant.GAME_WIDTH-w){
            right = false;
        }
        if(x <= 0){
            right = true;
        }
        // 修改字体大小
        Font f=g.getFont();
        g.setFont(new Font("微软雅黑",Font.BOLD,40));
        g.drawString("开关状态" + right,200,600);
        g.setFont(f);
    }

    public static void main(String[] args) {
        new DemoAnimation02().loadFrame();
    }
}
