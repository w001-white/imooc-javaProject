package com.lly.maplestory.util;

import com.lly.maplestory.client.MapleStoryClient;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目启动时，一次性将图片从硬盘中读取到JVM中
 * <br>静态加载图片（从内存中读取
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/11/30 13:07
 */
public class ImageUtil {
    /**
     * 外界无法访问的静态变量，用来存储项目中所有图片对象
     */
    private static final Map<String, Image> images = new HashMap<>();
    static {
        //logo图片
        images.put("logo",MapleStoryUtil.getImage("icon/logo" ));
        // 背景
        images.put("bg", MapleStoryUtil.getImage("bg/bg"));
        images.put("sky",MapleStoryUtil.getImage("bg/sky"));
        images.put("blood",MapleStoryUtil.getImage("blood/blood"));
        //hero right stand
        for (int i = 0; i < 4; i++) {
            images.put("hero_right_stand_" + i, MapleStoryUtil.getImage("hero/right/stand1_" + i));
        }
        //hero left stand
        for (int i = 0; i < 4; i++) {
            images.put("hero_left_stand_" + i, MapleStoryUtil.getImage("hero/left/stand1_" + i));
        }
        //hero right walk
        for (int i = 0; i < 5; i++) {
            images.put("hero_right_walk_" + i, MapleStoryUtil.getImage("hero/right/walk1_" + i));
        }
        //hero left walk
        for (int i = 0; i < 5; i++) {
            images.put("hero_left_walk_" + i, MapleStoryUtil.getImage("hero/left/walk1_" + i));
        }

        //left prone
        images.put("hero_left_prone",MapleStoryUtil.getImage("hero/left/prone_0"));
        //right prone
        images.put("hero_right_prone",MapleStoryUtil.getImage("hero/right/prone_0"));

        //left jump
        images.put("hero_left_jump",MapleStoryUtil.getImage("hero/left/jump_0"));
        ////right jump
        images.put("hero_right_jump",MapleStoryUtil.getImage("hero/right/jump_0"));

        //hero right shoot
        for (int i = 0; i < 4; i++) {
            images.put("hero_right_shoot_" + i, MapleStoryUtil.getImage("hero/right/shoot1_" + i));
        }
        //hero left shoot
        for (int i = 0; i < 4; i++) {
            images.put("hero_left_shoot_" + i, MapleStoryUtil.getImage("hero/left/shoot1_" + i));
        }
        //普通弓箭左右
        images.put("arrow_left_general",MapleStoryUtil.getImage("arrow/left/0"));
        images.put("arrow_right_general",MapleStoryUtil.getImage("arrow/right/0"));

        //木妖 左 站
        images.put("mob_mob1_left_stand",MapleStoryUtil.getImage("mob/mob1/left/stand_0"));
        //木妖 左 死亡
        for(int i = 0;i <12; i++){
            images.put("mob_mob1_left_die" + i, MapleStoryUtil.getImage("mob/mob1/left/die/die1_"+i));
        }
        //木妖 左 击中
        images.put("mob_mob1_left_hit",MapleStoryUtil.getImage("mob/mob1/left/hit/hit1_0"));
        //木妖 左 移动
        for(int i = 0;i < 4; i++){
            images.put("mob_mob1_left_move" + i, MapleStoryUtil.getImage("mob/mob1/left/move/move_"+i));
        }

        //木妖 右 站
        images.put("mob_mob1_right_stand",MapleStoryUtil.getImage("mob/mob1/right/stand_0"));
        //木妖 右 死亡
        for(int i = 0;i <12; i++){
            images.put("mob_mob1_right_die" + i, MapleStoryUtil.getImage("mob/mob1/right/die/die1_"+i));
        }
        //木妖 右 击中
        images.put("mob_mob1_right_hit",MapleStoryUtil.getImage("mob/mob1/right/hit/hit1_0"));
        //木妖 由 移动
        for(int i = 0;i < 4; i++){
            images.put("mob_mob1_right_move" + i, MapleStoryUtil.getImage("mob/mob1/right/move/move_"+i));
        }





        // 道具相关的
        images.put("HP_50", MapleStoryUtil.getImage("item/HP_50"));
        images.put("MP_50", MapleStoryUtil.getImage("item/MP_50"));
        //道具包界面
        images.put("itemPackage",MapleStoryUtil.getImage("itempackage/ItemPackage"));
        //跳台系列
        images.put("ground1",MapleStoryUtil.getImage("ground/ground1"));

        //伤害
        for (int i = 0;i < 10; i ++){
            images.put("power"+ i,MapleStoryUtil.getImage("power/"+i));
        }

    }


    /**
     * 根据key获取iamge对象
     * @param key 键
      * @return image对象
     */
    public static Image getKey(String key){

        return images.get(key);
    }
}
