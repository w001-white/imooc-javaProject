package com.imooc.Java.io.fileio.case1;

import java.io.File;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 11:29
 * @注释： 读取文件，判断文件类型
 */
public class ReadFile {
    public ReadFile(){
        // 创建file对象,通过将给定的路径名的字符串转换成一个抽象路径名创建一个新的 File实例。
        File file = new File("F:\\garbage\\imooc.txt");
        // 判断是文件还是目录
        System.out.println("是否是目录："+ file.isDirectory());
        System.out.println("是否是文件："+ file.isFile());

        System.out.println("==================");
        //创建从父路径名的字符串和一个孩子的一个新的 File实例文件。
        File file1 = new File("F:\\garbage","imooc.txt");
        System.out.println("是否是目录："+ file1.isDirectory());
        System.out.println("是否是文件："+ file1.isFile());

        System.out.println("==================");
        // 创建从一个家长的抽象路径名和一个孩子的路径字符串的新 File实例。
        File file2 = new File("F:\\garbage");
        File file3 = new File(file2,"imooc.txt");
        System.out.println("是否是目录："+ file3.isDirectory());
        System.out.println("是否是文件："+ file3.isFile());
    }
}
