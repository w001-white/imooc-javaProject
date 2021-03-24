package com.lly.maplestory.util;

import com.lly.maplestory.constant.Constant;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * 加载图片的工具类（从硬盘加载到内存）
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/11/30 12:57
 */
public class MapleStoryUtil {
    /**
     *通过图片名获取图片对象
     * @param imgName 图片路径名（去掉前缀和后缀
     * @return 图片对象
     */
    public static Image getImage(String imgName){
        URL u = MapleStoryUtil.class.getClassLoader().getResource(Constant.IMG_PRE + imgName + Constant.IMG_AFTER);
        BufferedImage img = null;
        try {
            img = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
