package com.imooc.Java.io.reader.output;

import java.io.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 8:03
 * @注释： 字符输入输出流:复制文字
 */
public class Test {
    public static void main(String[] args) {
        // 文件输入流
        FileInputStream fis;
        // 字符输入流
        InputStreamReader isr;
        // 文件输出流
        FileOutputStream fos;
        // 字符输出流
        OutputStreamWriter osw;

        try {
            // 写操作，把字符写入文件
            // 读和写不能使用同一个文件输入输出流，因为在第一个读或写的时候，文件会跳转到最后，导致下次读写无法完成
            fis = new FileInputStream("imooc001.txt");
            isr = new InputStreamReader(fis);
            // 此时并没有此文件，但是FileOutputStream会自动创建该文件
            fos = new FileOutputStream("imooc002.txt");
            osw = new OutputStreamWriter(fos);
            int n = 0;
            char[] c = new char[10];
            while ((n = isr.read(c)) != -1) {
                // 写，方法一
//                String s1 = new String(c1, 0, n1);
//                osw.write(s1);
                // 写，方法二
                osw.write(c, 0, n);
                // 可以写在方法外部
                osw.flush();
            }
            fis.close();
            isr.close();
            fos.close();
            osw.close();
            System.out.println("复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
