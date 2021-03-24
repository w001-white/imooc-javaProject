package com.imooc.Java.io.stream.file.input.case3;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 15:18
 * @注释：
 * read(byte[] b, int off, int len)读取文件
 * 读到 len从输入流到字节数组数据字节。
 */
public class FileInput {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("imooc.txt");
            byte[] b = new byte[100];
            fis.read(b,0,5);
            System.out.println(new String(b));
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
