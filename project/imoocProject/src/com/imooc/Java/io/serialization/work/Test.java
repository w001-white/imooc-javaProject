package com.imooc.Java.io.serialization.work;

import java.io.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 16:47
 * @注释：
 * 1、有什么方法可以判断文件中的对象是否读完并循环输出?
 * 手动在最后写入了一个结束标志null，oos.writeObject(null);
 * 读出的判定条件是 ois.readObject()!=null
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("apple系列产品信息：");
        Product product1 = new Product(123, "iphone", "telephone", 4888.0);
        Product product2 = new Product(234, "ipad", "computer", 5088.0);
        Product product3 = new Product(345, "macbook", "computer", 10688.0);
        Product product4 = new Product(256, "iwatch", "watch", 4799.0);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("imooc.txt"));
            ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("imooc.txt"));
            oos.writeObject(product1);
            oos.writeObject(product2);
            oos.writeObject(product3);
            oos.writeObject(product4);
            oos.flush();

            Product product = null;
            while ((product = (Product) ois.readObject()) != null){
                System.out.println(product);
                System.out.println();
            }
            oos.close();
            ois.close();
        } catch (EOFException e){
            /**
             * EOFException表示输入过程中意外地到达文件尾或流尾的信号,导致从session中获取数据失败。
             * 异常是tomcat本身的问题，由于tomcat上次非正常关闭时有一些活动session
             * 被持久化（表现为一些临时文件），在重启时，tomcat尝试去恢复这些session的持久化数据但又读取失败造成的。
             * 此异常不影响系统的使用。 因为保存在硬盘上的session数据读取失败，问题似乎不大，但是如果不处理一下，每次启动都会出现这个问题。
             * 使用try-catch捕捉到EOFException异常，并提示已完全读入'即可
             */
            // 使用try-catch捕捉到EOFException异常，并提示已完全读入'即可
//            System.out.println("已完全输入");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
