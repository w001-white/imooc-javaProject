package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.util.ImageUtil;
import com.lly.maplestory.util.MapleStoryUtil;

import java.awt.*;

/**
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/12/14 23:12
 */
public class Power extends AbstractMapleStoryObject {
    public static Image[] images = new Image[10];
    static {
        for (int i=0;i<10;i++){
            images[i] = ImageUtil.getKey("power"+ i);
        }
    }
    public int power;
    public Power(MapleStoryClient msc, int x, int y){
        this.msc = msc;
        this.x =  x - 55;
        this.y =  y - 50;
        this.width = images[0].getWidth(null);
        this.height = images[0].getHeight(null);
        this.speed = 3;
        this.live = true;
        this.power = msc.hero.getPower(msc.hero.attack);
    }

    public void draw(Graphics g){
        if (!live){
            msc.powers.remove(this);
            return;
        }

        int power = this.power;

        int units = power % 10;
        power = power/10;
        int tens = power % 10;
        power = power/10;
        int handreds = power % 10;
        power = power/10;
        int thounds = power % 10;

        if (thounds == 0 && handreds == 0 && tens == 0 ){
            g.drawImage(images[units], msc.bg.x + x + 3 * this.width, y,null);
        }else if (thounds == 0 && handreds == 0){
            g.drawImage(images[tens], msc.bg.x + x + 2 * this.width, y,null);
            g.drawImage(images[units], msc.bg.x + x + 3 * this.width, y,null);
        }else if (thounds == 0){
            g.drawImage(images[handreds], msc.bg.x + x + 1 * this.width, y,null);
            g.drawImage(images[tens], msc.bg.x + x + 2 * this.width, y,null);
            g.drawImage(images[units], msc.bg.x + x + 3 * this.width, y,null);

        }else{
            g.drawImage(images[thounds], msc.bg.x + x + 0 * this.width, y,null);
            g.drawImage(images[handreds], msc.bg.x + x + 1 * this.width, y,null);
            g.drawImage(images[tens], msc.bg.x + x + 2 * this.width, y,null);
            g.drawImage(images[units], msc.bg.x + x + 3 * this.width, y,null);
        }
        move();
    }

    @Override
    public void move() {
        y -= speed;
        if (y < 500){
            this.live = false;
        }

    }
}
