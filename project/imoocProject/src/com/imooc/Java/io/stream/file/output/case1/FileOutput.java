package com.imooc.Java.io.stream.file.output.case1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 15:40
 * @注释：
 */
public class FileOutput {
    public static void main(String[] args) {
        FileOutputStream fos;
        FileInputStream fis;
        try {
            // 存储之后文档中内容与需要存入内容不符，需要使用计算机进行读取
            // 表示覆盖之前的内容重新写入
//            fos = new FileOutputStream("imooc.txt");
            // 代表在后边继续写入，不进行覆盖
            fos = new FileOutputStream("imooc.txt", true);
            fos.write(200);
            fos.write('s');
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("one.txt不使用缓冲");
        // 读取刚才输入的内容
        try {
            fis = new FileInputStream("imooc.txt");
            byte[] b = new byte[100];
            fis.read(b,0,12);
            System.out.println(new String(b));
            System.out.println(fis.read());
            System.out.println((char) fis.read());
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
