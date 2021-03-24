package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.constant.Constant;
import com.lly.maplestory.util.ImageUtil;

import java.awt.*;

import static com.lly.maplestory.util.ImageUtil.*;

/**
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/12/8 16:33
 */
public class Item extends AbstractMapleStoryObject {
    public int qty=1;
    public  int type;
    public Item() {

    }

    private int timer;
    public Item(MapleStoryClient msc, int x, int y,int type) {

        this.msc = msc;
        this.x = x;
        this.y = y;
        this.type=type;
        this.img = ImageUtil.getKey("HP_50");
        this.img = ImageUtil.getKey("MP_50");
        this.width = img.getWidth(null);
        this.height = img.getWidth(null);
        switch (type) {
            case 0:
                this.img = ImageUtil.getKey("HP_50");
                break;
            case 1:
                this.img = ImageUtil.getKey("MP_50");
                break;
//            case 2:
//                this.img = ImageUtil.getKey("HP_50");
//                break;
//            case 3:
//                this.img = ImageUtil.getKey("HP_50");
//                break;
//            case 4:
//                this.img = ImageUtil.getKey("HP_50");
//                break;
            default:
        }

        }

    @Override
    public Rectangle getRectangle() {
        return new Rectangle(msc.bg.x+x,msc.bg.y+y+500,width,height);
    }

    @Override
    public void draw(Graphics g) {
//        timer++;
//         if(timer >= Constant.TIME_OUT){
//             this.live = false;
//         }
        if(!live){
            msc.items.remove(this);
            return;
        }

        //super.draw(g);
       g.drawImage(img, msc.bg.x + x, msc.bg.y + y+500 ,null);
        move();
//        System.out.println(x,y);
    }

    @Override
    public void move() {
        if (jump)
            jump();

    }

    //初速度
    private double v0 = Constant.INIT_JUMP_V0;
    //末速度
    private double vt;
    //重力加速度
    private static final double g = 9.8;
    //单位时间
    private double t = 0.5;
    //单位时间内的位移变化量
    private double delta_height = 0.0;

    public boolean jump = true;

    /**
     * 跳跃
     */

    private void jump() {
        // vt = v0 - g * t竖直上抛
        vt = v0 - g * t;
        //下一次的初速度是上一次的末速度
        v0 = vt;
        delta_height = v0 * t;
        y -= delta_height;
        if (y >= 830) {
            jump = false;
            v0 = Constant.INIT_JUMP_V0;
            vt = 0.0;
            y = 830;
        }
    }
}
