package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.constant.Constant;
import com.lly.maplestory.util.ImageUtil;

import java.awt.*;
import java.util.List;
import java.util.Random;

/**
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/12/3 20:29
 */
public class Arrow extends AbstractMapleStoryObject{
    private static  Image[] imgs=new Image[2];
    static {
        //左 普通
        imgs[0] = ImageUtil.getKey("arrow_left_general");
        //右 普通
        imgs[1] = ImageUtil.getKey("arrow_right_general");
    }

    public Arrow(){
        this.speed= Constant.ARROW_SPEED;


    }
    public Arrow(MapleStoryClient msc,int x,int y,Direction dir){
        this();
        this.msc =msc;
        this.x =x;
        this.y =y;
        this.width =imgs[0].getWidth(null);
        this.height =imgs[0].getWidth(null);
        this.dir = dir;
        this.action = Action.STAND;
    }

    @Override
    public void draw(Graphics g) {
        if(!live){
            //弓箭容器移除
            msc.arrows.remove(this);
            return;
        }
        super.draw(g);
        switch (dir){
            case LEFT:
                g.drawImage(imgs[0],x,y,null);
                break;
            case RIGHT:
                g.drawImage(imgs[1],x,y,null);
                break;
        }


    }

    @Override
    public void move() {
        //根据方向 移动
        switch (dir){
            case LEFT:
                this.x-=speed;
                break;
            case RIGHT:
                this.x+=speed;
                break;
        }
        outOfBouond();
    }
    //弓箭出界方法
    private void outOfBouond(){
        if(this.x<-500||this.x>Constant.GAME_WIDTH+500){
            this.live = false;
        }

    }
    @Override
    public Rectangle getRectangle() {
        return new Rectangle(x,y,width,height);
    }

    public static Random r = new Random();
    private boolean hit(Mob mob){
        if(this.live && mob.live && mob.action != Action.DIE && this.getRectangle().intersects(mob.getRectangle())){
    //          System.out.println("相交了。");

            //创建伤害
            Power power = new Power(msc,mob.x,msc.bg.y + mob.y);

            msc.powers.add(power);
            this.live = false;
            mob.HP -= power.power;
            if (mob.HP <= 0) {

                mob.action = Action.DIE;
                //几率掉落道具
                if (r.nextInt(100) >= 0) {
                    // 生成道具
                    Item item = new Item(msc, mob.x, mob.y - 485, r.nextInt(2));
//                System.out.println(item.y);
                    msc.items.add(item);
                }
            }
        }
        return false;
    }

    public boolean hit(List<Mob> mobs){
        for (int i=0;i<mobs.size();i++){
            Mob mob = mobs.get(i);
            if(this.hit(mob)){
                return true;
            }
        }
        return false;

    }
}
