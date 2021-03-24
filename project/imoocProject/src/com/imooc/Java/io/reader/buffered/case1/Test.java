package com.imooc.Java.io.reader.buffered.case1;

import java.io.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 15:55
 * @注释：
 * 借助字节流转换成字符流进行读写
 * 字符流缓冲流：加入缓冲区，提高读写速度
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
        // 字符缓冲输入流
        BufferedReader br;
        // 字符缓冲输出流
        BufferedWriter bw;

        try {
            // 写操作，把字符写入文件
            // 读和写不能使用同一个文件输入输出流，因为在第一个读或写的时候，文件会跳转到最后，导致下次读写无法完成
            fis = new FileInputStream("imooc001.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            // 此时并没有此文件，但是FileOutputStream会自动创建该文件
            fos = new FileOutputStream("imooc002.txt");
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            int n = 0;
            char[] c = new char[10];
            while ((n = br.read(c)) != -1) {
                // 写，方法一
//                String s1 = new String(c1, 0, n1);
//                osw.write(s1);
                // 写，方法二
                bw.write(c, 0, n);
                // 可以写在方法外部
                bw.flush();
            }
            fis.close();
            isr.close();
            fos.close();
            osw.close();
            br.close();
            bw.close();
            System.out.println("复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
