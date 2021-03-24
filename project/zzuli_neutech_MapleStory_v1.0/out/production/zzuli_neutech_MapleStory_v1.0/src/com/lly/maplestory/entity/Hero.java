package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.constant.Constant;
import com.lly.maplestory.util.ImageUtil;
import com.lly.maplestory.util.MapleStoryUtil;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 * 英雄类
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/12/1 13:11
 */
public class Hero extends AbstractMapleStoryObject{
    /**
     *  人物基础攻击力
     */
    public int attack;
    public static Image[] imgs = new Image[30];
    static {
        //右站
        for (int i = 0; i < 4; i++) {
            imgs[i] = ImageUtil.getKey("hero_right_stand_" + i);
        }
        //左站
        for (int i = 4; i < 8; i++) {
            imgs[i] = ImageUtil.getKey("hero_left_stand_" + (i - 4));
        }
        //右走
        for (int i = 8; i < 13; i++) {
            imgs[i] = ImageUtil.getKey("hero_right_walk_" + (i - 8));
        }
        //右站
        for (int i = 13; i < 18; i++) {
            imgs[i] = ImageUtil.getKey("hero_left_walk_" + (i - 13));
        }

        //左趴
        imgs[18] = ImageUtil.getKey("hero_left_prone");
        //右趴
        imgs[19] = ImageUtil.getKey("hero_right_prone");

        //左跳
        imgs[20] = ImageUtil.getKey("hero_left_jump");
        //右跳
        imgs[21] = ImageUtil.getKey("hero_right_jump");


        //右射
        for (int i = 22; i < 26; i++) {
            imgs[i] = ImageUtil.getKey("hero_right_shoot_" + (i - 22));
        }
        //左射
        for (int i = 26; i < 30; i++) {
            imgs[i] = ImageUtil.getKey("hero_left_shoot_" + (i - 26));
        }

    }

    public int power;
     public Hero(){
        this.speed = Constant.HERO_SPEED;
        this.dir = Direction.RIGHT;
        this.action = Action.STAND;
        this.attack =9999;
        this.power = getPower(attack);
    }

    /**
     *  获取人物的攻击力
     * @param attack
     * @return
     */
    public int getPower(int attack){
         return attack + r.nextInt(5);
    }

    public Hero(MapleStoryClient msc, int x, int y){
        this();
        this.msc = msc;
        this.width = imgs[0].getWidth(null);
        this.height = imgs[0].getHeight(null);
        this.x = x;
        this.y = y;
    }

    private int step_right_stand = 0;
    private int step_left_stand = 4;
    private int step_right_walk = 8;
    private int step_left_walk = 13;
    private int step_right_shoot = 22;
    private int step_left_shoot = 26;

    private int count;

    /**
     * 判断图片越界
     */
    private void imgOutOfBounds(){
        count++;

        if (step_right_stand > 3){
            step_right_stand = 0;
        }
        if (step_left_stand > 7){
            step_left_stand = 4;
        }
        if (step_right_walk > 12){
            step_right_walk = 8;
        }
        if (step_left_walk > 17){
            step_left_walk = 13;
        }

        if (step_right_shoot > 25){
            step_right_shoot = 22;
        }
        if (step_left_shoot > 29){
            step_left_shoot = 26;
        }
    }

    @Override
    public void draw(Graphics g) {// 40ms调用一次
        imgOutOfBounds();

        switch (dir){
            case RIGHT:
                switch (action){
                    case STAND:
                        //右边站着的图
                        //判断图片切换频率
                        if (count % 5 == 0){
                            g.drawImage(imgs[step_right_stand], x, y,null);
                            step_right_stand++;
                        }else {
                            g.drawImage(imgs[step_right_stand], x, y,null);
                        }
                        break;
                    case WALK:
                        if (count % 3 == 0){
                            g.drawImage(imgs[step_right_walk], x, y,null);
                            step_right_walk ++;
                        }else {
                            g.drawImage(imgs[step_right_walk], x, y,null);
                        }
                        break;
                    case PRONE:
                        g.drawImage(imgs[19],x,y + 30,null);
                        break;
                    case JUMP:
                        g.drawImage(imgs[21],x,y,null);
                        break;
                    case SHOOT:
                        if (count % 3 == 0){
                            g.drawImage(imgs[step_right_shoot], x, y,null);
                            step_right_shoot ++;
                        }else {
                            g.drawImage(imgs[step_right_shoot], x, y,null);
                        }
                        break;
                    default:
                }

                break;
            case LEFT:
                switch (action){
                    case STAND:
                        if (count % 5 == 0){
                        g.drawImage(imgs[step_left_stand], x, y,null);
                        step_left_stand++;
                    }else {
                        g.drawImage(imgs[step_left_stand], x, y,null);
                    }
                        break;
                    case WALK:
                        if (count % 3 == 0){
                            g.drawImage(imgs[step_left_walk], x, y,null);
                            step_left_walk++;
                        }else {
                            g.drawImage(imgs[step_left_walk], x, y,null);
                        }
                        break;
                    case PRONE:
                        g.drawImage(imgs[18],x,y + 30,null);
                        break;
                    case JUMP:
                        g.drawImage(imgs[20],x,y,null);
                        break;
                    case SHOOT:
                        if (count % 3 == 0){
                            g.drawImage(imgs[step_left_shoot], x, y,null);
                            step_left_shoot ++;
                        }else {
                            g.drawImage(imgs[step_left_shoot], x, y,null);
                        }
                        break;
                    default:
                }
                break;
            default:
                break;
        }


        move();
    }

    @Override
    public void move() {
//        if (left && !right){
//            this.x -= speed;
//            this.dir = Direction.LEFT;
//            this.action = Action.WALK;
//        }else if (right && !left) {
//            this.x += speed;
//            this.dir = Direction.RIGHT;
//            action = Action.WALK;
//        }else if ((!left && !right) || (left && right) ){
//            this.action = Action.STAND;
//        }
        //walk的boolea判断
        if(left && !right && !jump){
            this.dir = Direction.LEFT;
            if(walk){
                this.x -= speed;
                this.action = Action.WALK;
            }
        }else
        if (right && !left&& !jump){
            this.dir = Direction.RIGHT;
            if (walk){
                this.x += speed;
                this.action = Action.WALK;
            }
        }else if (prone && !jump ){

            this.action = Action.PRONE;
        }
        //原地跳
        else if (jump){
//            jump(msc.grounds);
            this.action = Action.JUMP;
        }
        //原地射击
        else if (shoot){
            this.action = Action.SHOOT;
            shoot();
        }
        else {
            this.action = Action.STAND;
        }
        if (jump){
            //竖直上抛
            jump(msc.grounds);
        }else {
            //自由落体
            jumpDown(msc.grounds);
        }
        //拾取道具
        if(pickup){
            pickup(msc.items);
        }
        outOfBoundS();//英雄出界
    }
    private int shoot_rate=0;
    //射箭方法
    private void shoot(){
        shoot_rate++;
        //完成动作后shoot
        if(shoot_rate%10==0){
            shoot=false;
            shoot_rate=0;
            Arrow arrow=null;
        }
        //创造弓箭对象
        Arrow arrow=null;
        if(this.dir==Direction.RIGHT){
            arrow=new Arrow(msc,this.x+this.width,this.y+this.height/2+7,this.dir);
        }else {
            arrow=new Arrow(msc,this.x-38,this.y+this.height/2+7,this.dir);
        }

        //通过中介者模式访问主类中的容器，添加进去
        msc.arrows.add(arrow);
    }
    /**
     * 英雄出界
     */
    private void outOfBoundS(){
       if (this.x <= 0){
           this.x = 0;
       }
       if (this.x >= Constant.GAME_WIDTH - this.width){
           this.x = Constant.GAME_WIDTH - this.width;
       }
        //if(this.x>=1038-this.width&&this.y>726-this.height+40){
        // this.x=1038-this.width;}
        //if(this.x>=1133-this.width&&this.y>666-this.height+40){
        //    this.x=1133-this.width;
        // }
    }

    //初速度
    public double v0 = Constant.INIT_JUMP_V0;
    //末速度
    private double vt;
    //重力加速度
    private static final double g = 9.8;
    //单位时间
    private double t = 0.5;
    //单位时间内的位移变化量
    private double delta_height = 0.0;
    /**
     * 跳跃
     */

//    private void jump(){
//        // vt = v0 - g * t竖直上抛
//        vt = v0 - g * t;
//        //下一次的初速度是上一次的末速度
//        v0 = vt;
//        delta_height = v0 * t;
//        y -=delta_height;
//        if (y >= 780){
//            jump = false;
//            v0 =Constant.INIT_JUMP_V0;
//            vt = 0.0;
//            y = 780;
//           }
//        }
   //表示自由落体的boolean变量
    public boolean drop=true;
    //grounds msc 管家中的List<Ground>容器
    public void jump(List<Ground>grounds) {
        if(!drop){
            vt = v0 - g * t;
            v0 = vt;
            delta_height = v0 * t;
            y -= delta_height;
            if (vt <= 0) {
                //开始自由落体
                drop = true;
                v0 = 0;
                vt = 0;


            }

        }else{
            jumpDown(grounds );
        }


    }
    //自由落体
    public void jumpDown(List<Ground>grounds){

            vt=v0+g*t;
            v0=vt;
            delta_height=v0*t;
            y +=delta_height;

        //停止自由落体,与地面相交判断
        for(int i=0;i<grounds.size();i++){
            Ground ground= grounds.get(i);
            if(this.getRectangle().intersects(ground.getRectangle())
                    /*this.y<=msc.bg.y+ground.y-this.height+40*/){
                //判断y值
                if(this.y>=msc.bg.y+ground.y-this.height){
                    this.y=msc.bg.y+ground.y-this.height;
                    jump=false;
                    drop=false;
                    v0=Constant.INIT_JUMP_V0;
                    vt=0;
                    break;
                }
            }else {
                drop=true;
                //System.out.println("AAAAA");
            }
        }


    }

//    public void jump(List<Ground> grounds){
//        if (){
//            jumpUp();
//        }
//        if (){
//            jumpDown();
//        }
//        for (int i = 0;i <grounds.size();i++){
//            Ground ground = grounds.get(i);
//            if (this.getRectangle().intersects(ground.getRectangle())){
//                if (this.y >= msc.bg.y + ground.y - this.height){
//                    this.y = msc.bg.y + ground.y - this.height;
//                }
//            }
//
//        }
//    }
    /**
     * boolea类型的开关，控制方向和动作的枚举类型
     */
    public boolean right,left,walk,prone,jump,shoot,pickup;
    /**
     * 按键操作
     *@param e 键盘事件
     */
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_A:
                left = true;
                walk = true;
                break;
            case KeyEvent.VK_D:
                right = true;
                walk = true;
                break;
            case KeyEvent.VK_S://趴着
                prone = true;
                break;
            case KeyEvent.VK_K://跳跃
                jump = true;
                break;
            case KeyEvent.VK_J://射击
                shoot = true;
                break;
            case KeyEvent.VK_L://拾取
                pickup = true;
                break;
            case KeyEvent.VK_I://道具包
                msc.itemPackage.live = !msc.itemPackage.live;
                break;

            default:
//                action = Action.STAND;
                break;
        }
    }

    /**
     * 抬起按键操作
     * @param e 键盘事件
     */
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_A:
                left = false;
                walk = false;
                break;
            case KeyEvent.VK_D:
                right = false;
                walk = false;
                break;
            case KeyEvent.VK_S:
                prone = false;
                break;
            case KeyEvent.VK_J:
                shoot=false;
                break;
            case KeyEvent.VK_L:
                pickup=false;
                break;
            default:
                break;
        }
    }

    public Rectangle getRectangle(){
        return new Rectangle(x,y,width,height);

    }

    /**
     *
     * @param item 道具
     * @return 是否拾取到
     */
    private boolean pickup(Item item){
        if(item.live&&this.getRectangle().intersects(item.getRectangle())){
            item.live=false;
            for(int i=0;i<msc.itemPackage.getItemPackage().size();i++) {
                Item itm=msc.itemPackage.getItemPackage().get(i);
                if(itm.type==item.type){
                    itm.qty+=1;
                    return true;

                }
            }
            msc.itemPackage.getItemPackage().add(item);
            return  true;
        }
        return false;
    }

    /**
     *
     * @param items 道具容器
     * @return 是否有拾取到
     */
    public boolean pickup(List<Item> items){
        for(int i=0;i< items.size();i++){
            Item item=items.get(i);
            if(pickup(item)){
                return true;
            }
        }
        return false;
    }
}
