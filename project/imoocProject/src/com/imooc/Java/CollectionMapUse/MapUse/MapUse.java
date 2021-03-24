package com.imooc.Java.CollectionMapUse.MapUse;

import java.util.*;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/23 15:43
 * @注释： Map的应用
 */
public class MapUse {
    public static void main(String[] args) {
        // 定义Map对象<String, String><key，value>
        Map<String, String> animal = new HashMap<String, String>();
        System.out.println("请输入三组单词对应的注释，并存放到HashMap中:");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.print("请输入key的值：");
            String key = scanner.next();
            System.out.print("请输入value（注释）的值：");
            String value = scanner.next();
            animal.put(key, value);
            i++;
        }
        // 使用普通方法
        System.out.println("=======================");
        for (String s : animal.values()) {
            System.out.print(s + "   ");
        }

        // 打印输出value的值，（直接使用迭代器的方法 ）
        System.out.println();
        System.out.println("使用迭代器方法");
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "   ");
        }

        System.out.println();
        System.out.println("打印输出key和value的值（通过entrySet方法输出）");
        // 通过entrySet方法输出,去掉警告，给Set加上泛型
        Set<Map.Entry<String, String>> entrySet = animal.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

        // 通过单词找到注释并输出
        // 通过keySet方法
        System.out.print("请输入将要查找的key：");
        String strSearch = scanner.next();
        // 1、取得keySet
        Set<String> keySet = animal.keySet();
        // 2、遍历keySet
        for (String key : keySet) {
            if (strSearch.equals(key)) {
                System.out.println("找到了" + "键值对为：" + key + "-" + animal.get(key));
                break;
            } else {
                System.out.println("没有找到");
                break;
            }
        }
    }
}
