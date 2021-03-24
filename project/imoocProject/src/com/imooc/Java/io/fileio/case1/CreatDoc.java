package com.imooc.Java.io.fileio.case1;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 11:42
 * @注释： 创建文件
 */
public class CreatDoc {
    public CreatDoc(){
        File file = new File("F:\\garbage\\imooc1.txt");
        // 判断文件是否存在
        if (!file.exists()){
            try {
                // 自动创建一个新的空文件命名的抽象路径名的当且仅当该文件不存在。
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
