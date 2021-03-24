package com.imooc.Java.io.fileio.case1;

import java.io.File;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/1 11:31
 * @注释： 创建文件夹
 */
public class CreateFile {
    public CreateFile() {
        File file = new File("F:\\garbage", "CreateFile");
        // 判断文件是否存在
        if (!file.exists()) {
            // 创建该目录下的抽象路径名命名。
            file.mkdir();
        }
    }

    public void CreateMoreFile() {
        File file = new File("F:\\garbage\\CreateFile\\aa\\aa");
        // 判断文件是否存在
        if (!file.exists()) {
            // 创建该目录下的抽象路径名命名，包括任何必要的但不存在父目录。
            file.mkdirs();
        }
    }
}