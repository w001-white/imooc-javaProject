package com.imooc.Java.array;

/**
 * @Author 旺
 * @Date 2021/1/4 20:10
 * 注释：冒泡排序(从小到大)
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] a = {3,1,4,5,2};
        System.out.print("排序前：");
        for(int n : a)
            System.out.print(n + "   ");
        System.out.println();

        /**
         * 增序排序
         */
        int temp;
        for(int i = 0; i<a.length; i++){
            for(int j = 1; j < a.length - i; j++){
                if(a[j-1] > a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("增序排序后：");
        for(int n:a)
            System.out.print(n + "   ");
        System.out.println();

        /**
         * 降序排序
         */
        for(int i = 0; i<a.length; i++){
            for(int j = a.length - 1; j > 0; j--){
                if(a[j] > a[j - 1]){
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.print("降序排序后：");
        for(int n:a)
            System.out.print(n + "   ");
    }
}
