package com.imooc.Java.StringUse.StringUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/3 20:38
 * @注释：
 */
public class StringEqual {
    public static void main(String[] args) {
        String str1 = "imooc";
        String str2 = "imooc";

        String str3 = new String("imooc");
        String str4 = new String("imooc");

        System.out.println("str1 == str2?" + (str1 == str2));
        System.out.println("str1 == str3?" + (str1 == str3));
        System.out.println("str4 == str3?" + (str4 == str3));
        System.out.println("str1 equals str2?" + str1.equals(str2));
        System.out.println("str1 equals str3?" + str1.equals(str3));

    }
}
