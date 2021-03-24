package com.imooc.Java.io.stream.buffered;

import java.io.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 16:40
 * @注释： 缓冲流:提前把文件数据加载到虚拟机中，提高代码的运行效率
 */
public class Buffered {
    public static void main(String[] args) {
        // 文件输出流
        FileOutputStream fos;
        // 缓冲输出流
        BufferedOutputStream bos;
        // 文件输出流,从硬盘中读取数据
        FileInputStream fis;
        // 缓冲输入流，把文件加载到内存中，从硬盘中读取数据时，中间加一个缓冲流
        BufferedInputStream bis;
        try {
            fos = new FileOutputStream("imooc.txt");
            bos = new BufferedOutputStream(fos);
            fis = new FileInputStream("imooc.txt");
            bis = new BufferedInputStream(fis);
            long startTime = System.currentTimeMillis();
            // 把数据写到缓冲区中，但是缓冲区未满，需强制清空缓冲区
            bos.write(50);
            bos.write('a');
            // close方法同样也会清空缓冲区
            bos.flush();
            System.out.println(bis.read());
            System.out.println((char) bis.read());
            long endTime = System.currentTimeMillis();
            // 计算运算时间，观察时间是否会缩短
            System.out.println("运行时间：" + (endTime - startTime));
            fos.close();
            bos.close();
            fis.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
