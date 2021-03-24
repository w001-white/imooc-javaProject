package com.imooc.Java.io.stream.file.input.case1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 15:02
 * @注释： read（）读取文件，无参
 * 从这个输入流读取一个字节的数据。
 */
public class FileInput {
    public static void main(String[] args) {
        // G:\ideaIC-2019.2.3\project\imoocProject\src\imooc.txt
        // 相对路径
        File file = new File("imooc.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file.getAbsolutePath());


        try {
            FileInputStream fileInputStream = new FileInputStream("imooc.txt");
            // 方式一：输出文档字节
            // 返回值为-1的时候，表示读取到文件的末尾
            int n = fileInputStream.read();
            // 读取第一个字符
            System.out.println((char) n);
            // 循环输出文件中的内容
            while (n != -1) {
                System.out.print((char) n);
                // 当n为-1的时候进行结束
                n = fileInputStream.read();
            }

            // 方法二：
            System.out.println();
            FileInputStream fileInputStream1 = new FileInputStream("imooc.txt");
            int i = 0;
            while ((i = fileInputStream1.read()) != -1){
                System.out.print((char) i);
            }
                // 关闭文件，释放java虚拟机的资源
                fileInputStream.close();
                fileInputStream1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
