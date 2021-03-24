package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.util.ImageUtil;

import java.awt.*;
import java.util.Arrays;

/**
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/12/4 19:49
 */
public class Mob extends AbstractMapleStoryObject{
    public static Image[] imgs = new Image[100];
    static {
        //左 站
        imgs[0] = ImageUtil.getKey("mob_mob1_left_stand");
       //左 死亡
        for(int i = 1;i < 12;i++){
            imgs[i] = ImageUtil.getKey("mob_mob1_left_die"+(i-1));
        }
        //左  击中
        imgs[12] = ImageUtil.getKey("mob_mob1_left_hit");
        //左 移动
        for(int i = 13;i < 17;i++){
            imgs[i] = ImageUtil.getKey("mob_mob1_left_move"+(i-13));
        }

        //右 站
        imgs[17] = ImageUtil.getKey("mob_mob1_right_stand");
        //右 死亡
        for(int i = 18;i < 30;i++){
            imgs[i] = ImageUtil.getKey("mob_mob1_right_die"+(i-1));
        }
        //右  击中
        imgs[30] = ImageUtil.getKey("mob_mob1_right_hit");
        //右 移动
        for(int i = 31;i < 35;i++){
            imgs[i] = ImageUtil.getKey("mob_mob1_right_move"+(i-31));
        }

    }


    public Mob(){
        this.img = imgs[0];
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.dir = Direction.LEFT;
        this.action = Action.WALK;
//        this.left = true;
        this.speed = 10;//怪物速度
        this.HP = MAX_HP;

    }
    public static final int MAX_HP = 20000;

    public Mob(MapleStoryClient msc,int x,int y){
        this();
        this.msc = msc;
        this.x = msc.bg.x + x;
        this.y = msc.bg.y + y;
    }

    public Mob(MapleStoryClient msc,int x,int y,String name,int level,int HP,int MP,int EXP,int speed){
        this(msc,x,y);

        this.msc = msc;
        this.name = name;
        this.level = level;
        this.HP = HP;
        this.MP = MP;
        this.EXP = EXP;
        this.speed = speed;
    }

    private boolean left,right;
    /**
     * 将方向枚举类型转化为数组
     */
    public Direction[] dirs = Direction.values();
    /**
     * 将动作枚举类型转化为数组
     */
    public Action[] actions = Action.values();
    @Override
    public void move() {
        if (this.action!=Action.DIE&&r.nextInt(1000) > 980){//调整怪物运动状态转变的几率
            //每次修改当前怪物的状态 方向、动作
            this.dir = dirs[r.nextInt(2)];
            this.action = actions[r.nextInt(2)];
        }
        switch (dir){
            case LEFT:
                switch (action){
                    case WALK:
                       left = true;
                       this.speed = 5;
                        break;
                    case STAND:
                        this.speed = 0;
                        break;
                    default:
                        break;
                }
                break;
            case RIGHT:
                switch (action){
                    case WALK:
                        left = false;
                        this.speed = 5;
                        break;
                    case STAND:
                        this.speed = 0;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        if (left){
            this.x -=speed;
        }else{
            this.x +=speed;
        }
        if (this.x<= msc.bg.x){
          this.dir = Direction.RIGHT;
        }
        if (this.x >= 1890){
            this.dir = Direction.LEFT;
        }
    }

    private int step_left_die = 1 ;

    private int step_left_move = 13;

    private int step_right_die = 18;

    private int step_right_move= 31;

    private int count ;

    private void confirmImage(){
        if(step_left_die > 11){//图组都画完了
            step_left_die = 11;
            this.live = false;
        }
        if(step_left_move > 16){
            step_left_move = 13;
        }

        //右
        if(step_right_die > 29){//图组都画完了
            step_right_die  = 29;
            this.live = false;
        }
        if(step_right_move > 34){
            step_right_move = 31;
        }


    }

    @Override
    public void draw(Graphics g){
        if (count++ > 100000){
            count = 0;
        }
        if(!live){
            msc.mobs.remove(this);
            return;
        }
        confirmImage();
        switch (dir){
            case LEFT:
                switch (action){
                    case STAND:
                        g.drawImage(imgs[0], msc.bg.x + x,msc.bg.y + y,null );
                        break;
                    case DIE:
                        g.drawImage(imgs[step_left_die++],msc.bg.x + x, msc.bg.y + y,null );
                        break;
                    case HIT:
                        g.drawImage(imgs[12],msc.bg.x + x, msc.bg.y + y - 10,null );
                        break;
                    case WALK:
                        if (count % 5 == 0){
                            g.drawImage(imgs[step_left_move],msc.bg.x + x, msc.bg.y + y,null );
                            step_left_move ++;
                        }else {
                            g.drawImage(imgs[step_left_move],msc.bg.x + x, msc.bg.y + y,null );
                        }
                        break;
                    default:
                        break;
                }
                break;
            case RIGHT:
                switch (action){
                    case STAND:
                        g.drawImage(imgs[17], msc.bg.x + x,msc.bg.y + y,null );
                        break;
                    case DIE:
                        g.drawImage(imgs[step_right_die++],msc.bg.x + x, msc.bg.y + y,null );
                        break;
                    case HIT:
                        g.drawImage(imgs[30],msc.bg.x + x, msc.bg.y + y - 10,null );
                        break;
                    case WALK:
                        if (count % 5 == 0){
                            g.drawImage(imgs[step_right_move],msc.bg.x + x, msc.bg.y + y,null );
                            step_right_move ++;
                        }else {
                            g.drawImage(imgs[step_right_move],msc.bg.x + x, msc.bg.y + y,null );
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;

        }
        move();
        //g.drawImage(img,msc.bg.x + x,msc.bg.y + y,null );
        if(HP<MAX_HP)
            this.drawBloodBar(g);
        //athis.drawBloodBar(g);

    }

    public BloodBar bb = new BloodBar();

    public void drawBloodBar(Graphics g){
    bb.draw(g);

    }

    class BloodBar extends AbstractMapleStoryObject{
        public BloodBar(){
            this.img = ImageUtil.getKey("blood");
            this.width  = img.getWidth(null);
        }

        @Override
        public void draw(Graphics g) {
            for (int i=0;i <  (Mob.this.width/this.width) * Mob.this.HP / MAX_HP;i++){
                g.drawImage(this.img,Mob.this.msc.bg.x + Mob.this.x + (i * 4),Mob.this.msc.bg.y + Mob.this.y - 12,null);
            }
        }
    }
    @Override
    public Rectangle getRectangle() {
        return new Rectangle( msc.bg.x +x,msc.bg.y + y - 12,width,height);
    }

}
