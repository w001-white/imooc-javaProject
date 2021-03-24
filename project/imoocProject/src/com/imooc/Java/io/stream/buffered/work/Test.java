package com.imooc.Java.io.stream.buffered.work;

import java.io.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 17:42
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("one.txt");
        File file1 = new File("two.txt");
        FileOutputStream fos;
        BufferedOutputStream bos;
        FileInputStream fis;
        BufferedInputStream bis;

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("one.txt不使用缓冲流来写");
        // 不使用缓冲
        try {
            fos = new FileOutputStream("one.txt");
            long startTime = System.currentTimeMillis();
            int i = 0;
            while (i < 50000) {
                fos.write('s');
                fos.write(50);
                i++;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("用时：" + (endTime - startTime));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 使用缓冲
        System.out.println("two.txt使用缓冲流来写");
        try {
            fos = new FileOutputStream("two.txt");
            bos = new BufferedOutputStream(fos);
            long startTime = System.currentTimeMillis();
            int i = 0;
            while (i < 50000) {
                bos.write('s');
                bos.write(50);
                i++;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("用时：" + (endTime - startTime));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
