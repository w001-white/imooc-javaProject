package com.imooc.Java.StringUse.StringUse;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/29 21:14
 * @注释：
 */
public class StringMethod {
    public static void main(String[] args) {
        String str = "JAVA 编程 基础 ";

        // 打印字符串长度
        System.out.println("字符串长度=" + str.length());
        // charAt(int index) 取出字符“程”并输出,index是从零开始计算
        System.out.println(str.charAt(6));
        // 去除子串“编程 基础”并输出
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 10));

        String str2 = "aaAaAaAaaAA";
        // 查找字符第一次出现的位置(区分大小写)
        System.out.println("字符\"a\"第一次出现的位置:" + str2.indexOf("a"));

        // 查找不到字符时候
        System.out.println("查找不到字符时候:" + str2.indexOf("aa"));

        // 查找字符最后一次出现的位置
        System.out.println("字符\"aa\"最后一次出现的位置:" + str2.lastIndexOf("aa"));

        // 在字符串index值为8的位置开始，查找子串"aa"第一次出现的位置
        System.out.println("在字符串index值为8的位置开始，查找子串\"aa\"第一次出现的位置" + str2.indexOf("aa", 2));

        // 将字符串全部转化为小写
        System.out.println("将字符串全部转化为小写" + str2.toLowerCase(Locale.ROOT));

        // 将字符串全部转化为大写
        System.out.println("将字符串全部转化为小写" + str2.toUpperCase(Locale.ROOT));

        // 将字符串转换为byte数组，中文字符表示是3个数字
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "  ");
        }

        // 将byte数组转换为字符串,编码形式须保持一致：UTF-8，JDK，使用指定编码形式时需要抛出异常
        System.out.println();
        String str1 = null;
        try {
            str1 = new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(str1);
    }
}
