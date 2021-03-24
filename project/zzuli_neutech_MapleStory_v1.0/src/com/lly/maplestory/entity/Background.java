package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.constant.Constant;
import com.lly.maplestory.util.ImageUtil;

import java.awt.*;
import java.security.PublicKey;

/**
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/11/30 18:53
 */
public class Background extends AbstractMapleStoryObject{
    public Background(){
        this.speed=Constant.HERO_SPEED;
        this.live = true;
    }

    public Background(MapleStoryClient msc, String key, int x, int y){
        this();
        this.msc = msc;
        this.img = ImageUtil.getKey(key);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.x = x;
        this.y = y;
        this.dir=Direction.LEFT;
        this.action =Action.STAND;
    }

    @Override
    public void draw(Graphics g) {
        sky.draw(g);
        g.drawImage(img, x, y,null);
    }

    @Override
    public Rectangle getRectangle() {
        return null;
    }

    @Override
    public void move() {
        if (msc.hero.dir==Direction.RIGHT && (msc.hero.action==Action.WALK || (msc.hero.action==Action.JUMP && msc.hero.right)) && msc.hero.x>=Constant.GAME_WIDTH/2 - Constant.HERO_SPEED ){
            this.x-=speed;
            msc.hero.speed=0;
            if (this.x<=-(this.width-Constant.GAME_WIDTH)){
                this.x=-(this.width-Constant.GAME_WIDTH);
                msc.hero.speed=Constant.HERO_SPEED;
            }
        }
        if (msc.hero.dir==Direction.LEFT && (msc.hero.action==Action.WALK || (msc.hero.action==Action.JUMP && msc.hero.left)) && msc.hero.x<Constant.GAME_WIDTH/2+Constant.HERO_SPEED){
            this.x+=speed;
            msc.hero.speed=0;
            if (this.x>=0){
                this.x=0;
                msc.hero.speed=Constant.HERO_SPEED;
            }
        }
    }
    Sky sky = new Sky();
    class Sky extends AbstractMapleStoryObject{

        public Sky(){
            this.img = ImageUtil.getKey("sky");
        }
        public void draw(Graphics g){
            for (int i=0;i<160;i++)
            g.drawImage(img,(i*22),y,null);
        }
    }
}
