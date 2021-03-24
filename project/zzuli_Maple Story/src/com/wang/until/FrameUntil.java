package com.wang.until;

import com.wang.gui.Constant;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 *  项目中资源加载（图片，声音）
 */
public class FrameUntil {
    public static Image getImage(String imgPath){
        // 通过反射机制，将资源路径下的资源转换成字符解码加载到内存中
        URL u = FrameUntil.class.getClassLoader().getResource(Constant.IMGPATH_PRE + imgPath);
        BufferedImage img = null;
        // 通过I/O流读取
        try {
            img = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
