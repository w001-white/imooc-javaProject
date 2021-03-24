package com.lly.maplestory.client;

import com.lly.maplestory.constant.Constant;
import com.lly.maplestory.entity.*;
import com.lly.maplestory.util.ImageUtil;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 项目运行的主类
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/11/30 13:15
 */
public class MapleStoryClient extends MapleStoryFrame{
    @Override
    public void loadFrame() {
        super.loadFrame();
        //添加键盘监听器
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                hero.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                hero.keyReleased(e);
            }
        });
    }

    /**
     * 背景图片y-1592
     *
     */
    public Background bg = new Background(this, "bg", 0 - 20, Constant.GAME_HEIGHT-1500);
    /**
     * 英雄对象
     */
    public Hero hero = new Hero(this, 200,500);
    /**
     * 弓箭对象
     */
    //public  Arrow arrow=new Arrow(this,400,500);
    public CopyOnWriteArrayList<Arrow> arrows =new CopyOnWriteArrayList<>();
    /**
     * 怪物容器
     */
    public List<Mob> mobs = new CopyOnWriteArrayList<>();

    /**
     *  道具
     */
//    public Item item = new Item(this,400,600);
    public List<Item> items = new CopyOnWriteArrayList<>();
//    public Item item=new Item(this,500,700,1);
    /**
     * 普通代码块初始化Mobs容器
     */
    {
        for (int i = 0; i < 99; i++) {
            Mob mob = new Mob( this,(i * 150) + 500,1815);
            mobs.add(mob);
        }
    }


    public List<Power> powers = new CopyOnWriteArrayList<>();
    Power power = new Power(this,500,700);
  //  public Ground ground = new Ground(this,0,500,"ground1");

    public List<Ground> grounds = new CopyOnWriteArrayList<>();

    {
        Ground ground1 = new Ground(this,0,1863,3225,140);
        grounds.add(ground1);
        Ground ground2 = new Ground(this,353,1560,920,35);
        grounds.add(ground2);
        Ground ground3 = new Ground(this,2460,1578,270,34);
        grounds.add(ground3);
        Ground ground4 = new Ground(this,1050,1321,180,34);
        grounds.add(ground4);
        Ground ground5 = new Ground(this,1305,1347,920,111);
        grounds.add(ground5);
        Ground ground6 = new Ground(this,2550,1578,180,34);
        grounds.add(ground6);
        Ground ground7 = new Ground(this,2805,1361,415,95);
        grounds.add(ground7);
        Ground ground8 = new Ground(this,823,1076,450,94);
        grounds.add(ground8);
        Ground ground9 = new Ground(this,2415,1120,450,94);
        grounds.add(ground9);
        //下面是梯子
        Ground ground10 = new Ground(this,382,1552,48,173);
        grounds.add(ground10);
        Ground ground11 = new Ground(this,2503,1568,47,249);
        grounds.add(ground11);
        Ground ground12 = new Ground(this,3099,1353,47,510);
        grounds.add(ground12);
        Ground ground13 = new Ground(this,1003,1065,47,211);
        grounds.add(ground13);
        Ground ground14 = new Ground(this,2460,1110,47,439);
        grounds.add(ground14);


//        Ground ground1 = new Ground(this,0,500,"ground1");
//        grounds.add(ground1);
//        Ground ground2 = new Ground(this,0,500,"ground2");
//        grounds.add(ground2);
//        Ground ground3 = new Ground(this,0,500,"ground3");
//        grounds.add(ground3);
//        Ground ground4 = new Ground(this,0,500,"ground4");
//        grounds.add(ground4);
//        Ground ground5 = new Ground(this,0,500,"ground5");
//        grounds.add(ground5);
//        Ground ground6 = new Ground(this,0,500,"ground6");
//        grounds.add(ground6);
//        Ground ground7 = new Ground(this,0,500,"ground7");
//        grounds.add(ground7);
//        Ground ground8 = new Ground(this,0,500,"ground8");
//        grounds.add(ground8);
//        Ground ground9 = new Ground(this,0,500,"ground9");
//        grounds.add(ground9);
//        //下面是梯子
//        Ground ground10 = new Ground(this,0,500,"ground10");
//        grounds.add(ground10);
//        Ground ground11 = new Ground(this,0,500,"ground11");
//        grounds.add(ground1//        Ground ground12 = new Ground(this,0,500,"ground12");
//        grounds.add(ground12);
//        Ground ground13 = new Ground(this,0,500,"ground13");
//        grounds.add(ground13);
//        Ground ground14 = new Ground(this,0,500,"ground14");
//        grounds.add(ground14);
    }
    public ItemPackage itemPackage=new ItemPackage(this,800,300);

    @Override
    public void paint(Graphics g) {
        bg.draw(g);
        Iterator<Ground> itGrounds = grounds.iterator();
        while (itGrounds.hasNext()){
            Ground ground = itGrounds.next();
            ground.draw(g);
        }

        hero.draw(g);
//        hero.pickup(items);

       // ground.draw(g);


//        item.draw(g);

        //弓箭迭代器
        Iterator<Arrow> itArrows = arrows.iterator();
        while (itArrows.hasNext()){
            Arrow arrow = itArrows.next();
            arrow.draw(g);
            arrow.hit(mobs);
        }

        //怪兽迭代器
        Iterator<Mob> itMobs = mobs.iterator();
        while (itMobs.hasNext()){
            Mob mob = itMobs.next();
            mob.draw(g);

        }
        //伤害
        Iterator<Power> itPowers = powers.iterator();
        while(itPowers.hasNext()){
            itPowers.next().draw(g);
        }

        //道具
        Iterator<Item> itItems = items.iterator();
        while(itItems.hasNext()){
            Item item = itItems.next();
            item.draw(g);
        }



        bg.move();
       itemPackage.draw(g);
        Font f = g.getFont();
        g.setFont(new Font("微软雅黑", Font.BOLD, 30));
        g.drawString("Item.size:" + items.size(), 1200, 150);
        g.drawString("power.x:" + power.x, 1200, 200);
        g.drawString("power.y:" + power.y, 1200, 250);
//        g.drawString("itemPackage.getItemPackage.size()"+itemPackage.getItemPackage().size(),1200,500);
//        g.drawString("item.x:" + item.x, 1200, 300);
//        g.drawString("item.y:" + item.y, 1200, 350);
        g.drawString("hero.x:" + hero.x, 1200, 400);
        g.drawString("hero.y:" + hero.y, 1200, 450);




        g.setFont(f);

    }

    public static void main(String[] args) {
        new MapleStoryClient().loadFrame();
    }
}
