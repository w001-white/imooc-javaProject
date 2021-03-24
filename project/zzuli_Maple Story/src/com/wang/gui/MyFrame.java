package com.wang.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    /*
   自定义生成窗口方法
    */
    public void loadFrame(){
        // 设置窗口大小
        this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        // 设置窗口位置
//        this.setLocation(0,0);
        // 设置窗口相对于桌面剧中
        this.setLocationRelativeTo(null);
        // 设置窗口可见性（默认为false）
        this.setVisible(true);
        // 设置窗口不可变性(默认为true)
        this.setResizable(false);
        // 窗口关闭的功能,添加窗口监听器
        this.addWindowListener(new WindowAdapter() {//匿名内部类
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //启动线程
        new MyThread().start();
    }

    /**
     *  添加重画窗口的线程（多线程）
     */
    class MyThread extends Thread{
        @Override
        public void run() {
            for(;;){//while(true)
                repaint();//调用paint(Graphics g)一次
                try {
                    Thread.sleep(40);// 每隔40ms刷新一次
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     *  解决图片闪烁问题，使用双缓冲技术
     */
    Image backImg = null;

    // 重写update()方法，在窗口的里层添加一个虚拟的图片
    @Override
    public void update(Graphics g) {
        if (backImg == null) {
            // 如果虚拟图片不存在，创建一个和窗口一样大小的图片
            backImg = createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        }
        // 获取到虚拟图片的画笔
        Graphics backg = backImg.getGraphics();
        Color c = backg.getColor();
        backg.setColor(Color.white);// 虚拟图片的背景颜色
        backg.fillRect(0, 0, Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        backg.setColor(c);
        // 调用虚拟图片的paint()方法，每50ms刷新一次
        paint(backg);
        g.drawImage(backImg, 0, 0, null);
    }
}

