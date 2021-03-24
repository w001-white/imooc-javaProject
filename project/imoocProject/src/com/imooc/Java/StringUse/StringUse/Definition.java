package com.imooc.Java.StringUse.StringUse;

import java.io.UnsupportedEncodingException;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/28 23:43
 * @注释： 字符串的5种定义方法
 */
public class Definition {
    public static void main(String[] args) {
        // 1、"imooc“是字符串常量，使用"imooc"创建一个字符串对象，并赋值给字符串引用s。
        String str1 = "imooc";
        System.out.println(str1);

        // 2、使用new关键字创建字符串对象，字符串的值为一个空串"
        String str2 = new String();
        str2 = "imooc";
        System.out.println(str2);

        /** 3、使用字符串常量"mooc"创建对象，会先去常量池中查看"imooc"是否存在，如果存在就直接使用"imooc"创建对象，
         * 如果不存在,就先在常量池中创建字符串"imooc”，然后再使用"imooc“创建对象，赋值给字符串引用str3
         */
        String str3 = new String("imooc");
        System.out.println(str3);

        // 4、可以使用字符数组创建字符串，先定义一个字符数组，创建字符串对象时使用字符数组作为参数。
        char[] ch1 = {'i', 'm', 'o', 'o', 'c'};
        String str4 = new String(ch1);
        System.out.println(str4);

        /**
         * 5、除了使用字符数组的所有元素创建字符串以外，还可以使用字符数组的一部分创建字符串。
         *  这里的参数1和2的含义是:1表示从数组元素的第几位开始，2表示一共几个数组元素。从第一位开始也就是从m这个字符开始，
         *  2表示从m开始的两个字符，因此字符串s的值为'mo'
         */
        char[] ch2 = {'i', 'm', 'o', 'o', 'c'};
        String str5 = new String(ch2, 1, 2);
        System.out.println(str5);

        //6、可以利用字节数组生成字符串，与字符数组都在输入输出流部分应用较多，用于存储传输的二讲制数据
        byte[] bytes = {54, 88, 89, 100};
        String str6 = new String(bytes);
        String str7 = new String(bytes,1,2);
        System.out.println(str6+"     "+str7);

        try {
            String str8=new String(bytes,"utf-8");
            System.out.print(str8+"     ");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        try {
            String str9 = new String(bytes,1,2,"utf-8");
            System.out.println(str9);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        System.out.println(str8+"            "+str9);
    }
}
