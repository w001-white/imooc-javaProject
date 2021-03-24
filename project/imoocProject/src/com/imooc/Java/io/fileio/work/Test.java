package com.imooc.Java.io.fileio.work;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 11:51
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        // 创建
        File file = new File("F://garbage//Monday.docx");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("创建文件成功\n文件名称:" + file.getName() + "\n文件上一级目录：" + file.getParentFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 文件/目录
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("文件/目录：这是一个目录");
            }
            if (file.isFile()) {
                System.out.println("文件/目录：这是一个文件");
            }
        }

        // 读写性
        if (file.canRead() && file.canWrite()) {
            System.out.println("读写性:这个文件既可以读还可以写");
        }
    }
}
