package com.wang.solar.client;

import com.wang.solar.entity.Planet;
import com.wang.solar.entity.Sun;
import com.wang.solar.util.GameUntil;
import com.wang.solar.util.ImageUtil;
import com.wang.solar.util.MyFrame;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wang
 * @Version 1.0
 * @date 2020/11/26 12:48
 */
public class SolarSystemClient extends MyFrame {

    public Image bg = ImageUtil.getImage("bg");
//    public Image sun = GameUntil.getImage("sun.jpg");
    public Sun sun=new Sun();

    public Planet Mercury = new Planet(this, sun, "Mercury", "水星", 0.387, 0.2056, 88);
    public Planet Venus = new Planet(this, sun, "Venus", "金星", 0.72, 0.0068, 225, true);
    public Planet earth = new Planet(this, sun, "earth", "我们的家园", 1, 0.0167, 365);

    public Planet moon = new Planet(this, earth, "moon", "", 0.3, 0.0, 365/12);

    public Planet Mars = new Planet(this, sun, "Mars", "火星", 1.52, 0.0934, 687);
    public Planet Jupiter = new Planet(this, sun, "Jupiter", "木星", 5.2, 0.0489, 4330);
    public Planet Saturn = new Planet(this, sun, "Saturn", "土星", 9.54, 0.0557, 10832);
    public Planet Uranus = new Planet(this, sun, "Uranus", "天王星", 19.218, 0.0444, 30777);
    public Planet Neptune = new Planet(this, sun, "Neptune", "海王星", 30.06, 0.0112, 60328);
    public Planet Pluto = new Planet(this, sun, "Pluto", "冥王星", 39.68, 0.249, 90717);

    public Planet Halley = new Planet(this, sun, "Halley", "哈雷彗星", 35.1, 0.967, 27485);

    /**
     *   当前星系的半长轴为4倍
     */
    public int rate = 4;

    public List<Planet> planets = new ArrayList<>();
    {
        // 创建1000个小行星，形成小行星带（AU：2.17~3.64）
        for(int i = 0; i<1000; i++){
            //Math.random()取值[0,1）
            Planet smallPlanet = new Planet(this, sun, true, "smallPlanet", "", Math.random() * 2 + 2, 0.0, (int)(Math.random() *3300 + 700));
            planets.add(smallPlanet);
        }
    }

    public List<Planet> Jupiterplanets = new ArrayList<>();
    {
        // 木星8卫星
        for(int i = 0; i<8; i++){
            //Math.random()取值[0,1）
            Planet JupiterPlanet = new Planet(this, Jupiter, true, "JupiterPlanet", "", Math.random() * 2 + 2, 0.0, (int)(Math.random() *3300 + 700));
            planets.add(JupiterPlanet);
        }
    }
    @Override
    public void loadFrame() {
        this.setIconImage(ImageUtil.getImage("Sun"));
        super.loadFrame();
        this.setTitle("太阳系八大行星运行系统");
        // 添加键盘监听器
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

//                System.out.println("sfaf");
//              // 按 上键 rate 减小2倍
//               System.out.println(e.getKeyCode());
//               if(e.getKeyCode() == 38){
//                    rate *= 2;
//                }
//                // 按 下键 rate 减小2倍
//                if(e.getKeyCode() == 40){
//                    rate /= 2;
//                }
                switch (e.getKeyCode()){
                    // 按 上键 rate 减小2倍
                    case KeyEvent.VK_UP:
                        rate *= 2;
                        break;
                    // 按 下键 rate 减小2倍
                    case KeyEvent.VK_DOWN:
                        rate /= 2;
                        break;
                    default:
                }
                if(rate <= 1) rate = 1;
                if(rate >= 64) rate = 64;
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // 背景
        g.drawImage(bg,0,0,null);
        //太阳
//        g.drawImage(bg,0,0,null);
        sun.draw(g);
        //近日行星
        Mercury.draw(g);
        Venus.draw(g);
        earth.draw(g);

        moon.draw(g);
        //小行星带
        for(Planet planet : planets){
            planet.draw(g);
        }
        //巨行星
        Jupiter.draw(g);
        //小木星8卫星
        for(Planet planet : Jupiterplanets){
            planet.draw(g);
        }
        Mars.draw(g);
//
        Saturn.draw(g);
        Uranus.draw(g);
        //远日行星
        Neptune.draw(g);
        //冥王星
        Pluto.draw(g);
        //哈雷彗星
        Halley.draw(g);



        Font f = g.getFont();
        g.setFont(new Font("微软雅黑",Font.BOLD,35));
        Color c = g.getColor();
        g.setColor(Color.white);
        g.drawString("rate：" + rate, 100, 100);
        g.setColor(c);
        g.setFont(f);
    }

    public static void main(String[] args) {
        new SolarSystemClient().loadFrame();
    }
}
