package com.imooc.Java.io.reader.input;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 8:07
 * @注释： 创建文件
 */
public class CreateFile {
    public CreateFile(){
        File file = new File("imooc001.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
