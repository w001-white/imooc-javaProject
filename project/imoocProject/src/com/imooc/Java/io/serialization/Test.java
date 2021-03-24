package com.imooc.Java.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 16:22
 * @注释：
 * 对象序列化：例如在聊天的过程中，把一个人的信息发送给另一个人
 * 对象反序列化：把传送的信息翻译成可视文字
 * 步骤:
 * –创建一个类，继承Serializable接口
 * -创建对象
 * -将对象写入文件-从文件读取对象信息
 */
public class Test {
    public static void main(String[] args) {
        // 定义Goods类的对象
        Goods goods1 = new Goods("gd001", "电脑", 3000);
        try {
            FileOutputStream fos = new FileOutputStream("imooc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("imooc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // 将Goods对象信息写入文件
            // 注意读的顺序和下方写的顺序是一样的
            oos.writeObject(goods1);
            oos.writeBoolean(true);
            oos.flush();
            // 读对象信息
            Goods goods = (Goods) ois.readObject();
            System.out.println(goods);
            System.out.println(ois.readBoolean());

            fos.close();
            oos.close();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
