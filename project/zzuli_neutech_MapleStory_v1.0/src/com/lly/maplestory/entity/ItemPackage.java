package com.lly.maplestory.entity;

import com.lly.maplestory.client.MapleStoryClient;
import com.lly.maplestory.util.ImageUtil;

import java.awt.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/12/17 14:40
 */
public class ItemPackage extends AbstractMapleStoryObject{
    private List<Item> itemPackage=new CopyOnWriteArrayList<>();
    public ItemPackage(MapleStoryClient msc,int x,int y){
        this.msc=msc;
        this.x=x;
        this.y=y;
        this.img= ImageUtil.getKey("itemPackage");
        this.live=false;
    }
    /*

     */
    public  List<Item> getItemPackage(){
        return this.itemPackage;
    }
    public void draw(Graphics g){
        if(live) {
            //道具包界面
            g.drawImage(img, x, y, null);
            //道具
            for(int i=0;i<itemPackage.size();i++){
                Item item=itemPackage.get(i);
                g.drawImage(item.img,i*36+x+13,y+53,null);
                g.drawString(""+item.qty,i*36+x+13,y+81);
            }
        }
    }

}



