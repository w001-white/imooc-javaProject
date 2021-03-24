package com.imooc.Java.CollectionMapUse.MapUse.MapWork;

import java.util.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/23 16:43
 * @注释：
 */
public class MapWork {
    public static void main(String[] args) {
        // int类型需要使用int的封装类，Integer默认是null
        Map<Integer, String> year = new HashMap<Integer, String>();
        System.out.println("输入内容：");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.print("请输入年份：");
            int key = scanner.nextInt();
            System.out.print("请输入国家：");
            String value = scanner.next();
            year.put(key, value);
            i++;
        }

        System.out.println();
        System.out.println("使用迭代器方法输出国家：");
        Iterator<String> it = year.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "   ");
        }

        System.out.println();
        System.out.println("使用EntrySet方法输出国家：");
        Set<Map.Entry<Integer, String>> set = year.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }


    }
}
