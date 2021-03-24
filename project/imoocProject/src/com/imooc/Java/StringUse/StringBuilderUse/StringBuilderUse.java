package com.imooc.Java.StringUse.StringBuilderUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/3 21:14
 * @注释： StringBuilder具备字符可变性
 */
public class StringBuilderUse {
    public static void main(String[] args) {
        // 总而言之str1不可变，只是在常量池中新创建一个变量
        String str1 = "imooc";
        String str2 = "ss"+str1;
        System.out.println(str1);
        System.out.println(str2);

        // stringBuilder方法则是在堆开辟的空间中直接改变字符串的内容
        StringBuilder str3 = new StringBuilder("你好");
//        str3.append(',');
//        str3.append("imooc");
//        System.out.println(str3);
        System.out.println(str3.append("__").append(",imooc"));

        /**
         * 将str3变为你好__,iMOOc
         * 两种方案：
         */

        // 方案一：删除moo，然后插入MOO
//        System.out.println(str3.delete(6,9).insert(6,"MOO"));

        // 方案二：使用replace方法替换
        System.out.println(str3.replace(6,9,"MOO"));


    }
}
