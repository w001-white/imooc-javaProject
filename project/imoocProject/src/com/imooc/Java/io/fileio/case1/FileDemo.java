package com.imooc.Java.io.fileio.case1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 11:15
 * @注释： file读取
 */
public class FileDemo {
    public static void main(String[] args) {
        // 读取文件的三种方式，以及文件类型的判断
        ReadFile readFile = new ReadFile();
        // 创建一个目录
        CreateFile createFile = new CreateFile();
        // 创建一个多级目录
        createFile.CreateMoreFile();
        // 创建文件
        CreatDoc creatDoc = new CreatDoc();
    }
}
