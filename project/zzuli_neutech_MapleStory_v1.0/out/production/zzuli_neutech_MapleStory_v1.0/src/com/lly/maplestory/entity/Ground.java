package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.util.ImageUtil;

import java.awt.*;

/**
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/12/9 12:38
 */
public class Ground extends AbstractMapleStoryObject{


    public Ground(){


    }

    public Ground(MapleStoryClient msc, int x,int y,int width,int height){
        this.msc = msc;
        this.x = msc.bg.x + x;
        this.y = msc.bg.y + y;
        this.width = width;
        this.height = height;

    }
    public Ground(MapleStoryClient msc, int x,int y,String key){
        this.msc = msc;
        this.x = msc.bg.x + x;
        this.y = msc.bg.y + y;
        this.img =  ImageUtil.getKey(key);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }

    public void draw(Graphics g){
        move();
        // g.drawRect(msc.bg.x + x,msc.bg.y + y,width,height);
        //g.drawImage(img,msc.bg.x + x,msc.bg.y + y,null);
    }



    @Override
    public Rectangle getRectangle() {

        return new Rectangle(msc.bg.x + x,msc.bg.y + y,width,height);
    }

    @Override
    public void move() {

    }
}
