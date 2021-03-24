package com.imooc.Java.io.reader.buffered.case2;

import java.io.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 15:55
 * @注释：
 * FileRead、FileWrite,字符流特定的读写类
 * 字符流缓冲流：加入缓冲区，提高读写速度
 */
public class Test {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("imooc001.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("imooc002.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int n = 0;
            char[] c = new char[10];
            while ((n = br.read(c)) != -1){
                bw.write(c,0,n);
                bw.flush();
            }
            fr.close();
            br.close();
            fw.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
