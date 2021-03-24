package com.imooc.Java.io.reader.input;

import java.io.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 8:03
 * @注释： 字符输入输出流:读取文字
 */
public class Test {
    public static void main(String[] args) {
        // 文件输入流
        FileInputStream fis;
        // 字符输入流
        InputStreamReader isr;

        // 创建文件
        CreateFile cf = new CreateFile();

        try {
            fis = new FileInputStream("imooc001.txt");
            isr = new InputStreamReader(fis);
            int n = 0;
            char[] c = new char[10];
            // 读取：方法一
//            while ((n = isr.read()) != -1){
//                System.out.print((char)n);
//            }
            // 方法二
            while ((n = isr.read(c)) != -1) {
                // 存在可能最后一次读取未沾满空间，会存在多余数据
//                String s =  new String(c);
                String s = new String(c, 0, n);
                System.out.print(s);
            }
            fis.close();
            isr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
