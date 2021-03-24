package com.imooc.Java.io.stream.file.output.case2;

import java.io.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 16:15
 * @注释： 文件的复制粘贴
 */
public class Copy {
    public static void main(String[] args) {
        // 文件拷贝
        try {
            // 相对路径，java默认文件存储文件在G:\ideaIC-2019.2.3\project\imoocProject\src，可以在同一等级的目录下继续写地址
            // gif文件同样复制
//            FileInputStream fis = new FileInputStream("com\\imooc\\io\\stream\\fileoutputstream\\case2\\happy.jpg");
//            FileOutputStream fos = new FileOutputStream("com\\imooc\\io\\stream\\fileoutputstream\\case2\\happycopy.jpg");
            FileInputStream fis = new FileInputStream("com\\imooc\\io\\stream\\fileoutputstream\\case2\\happy.gif");
            FileOutputStream fos = new FileOutputStream("com\\imooc\\io\\stream\\fileoutputstream\\case2\\happycopy.gif");
            int n = 0;
            byte[] b = new byte[1024];
            while ((n = fis.read(b)) != -1){
                /**
                 * 观察复制后的文件比复制之前大一部分（此时是1k）
                 * 原因是，当最后一次读取时不一定能够沾满全部的数组空间，但是写的时候会全部写入，会大于实际所占空间
                 */
//                fos.write(b);
                // 修改:当读取的不是最后一个字节的时候，n就是读取的字节数
                fos.write(b,0,n);
            }

            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
