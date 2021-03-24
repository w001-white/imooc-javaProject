package com.imooc.Java.array;

/**
 * @Author 旺
 * @Date 2021/1/4 20:30
 * 注释：二维数组的应用
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 二维数组的三种声明方法
        int[][] a;
        float b[][];
        double[] c[];
        // 创建一个三行三列的二维数组
        a = new int[3][3];
        System.out.println("数组a的第二行第三列的数字为：" + a[1][2]);
        a[2][1] = 9;
        System.out.println("数组a的第三行第二列的数字为：" + a[2][1]);

        // 声明数组的同时创建数组
        char[][] d = new char[3][5];
        // 创建float类型的二维数组，只指定行数,列数可省略，行数不可省略
        float[][] f = new float[5][];
        // 不能输出，二维数组[m][n]相当于m个一维数组组成，每个一维数组包含n个数字，每个一维数组应具有一个名字，此时一维数组不具备名字，因此找不到数组的位置
        // System.out.println(f[0][0]);
        // 每行相当于一个一维数组
        // 第一行具有4列
        f[0] = new float[4];
        // 第二行具有3列
        f[1] = new float[3];
        // 第三行具有2列
        f[2] = new float[2];
        // 输出第二行第三个数字
        System.out.println(f[1][2]);
        // 数组下标越界
//        System.out.println(f[0][4]);
        // 二维数组初始化
        int[][] num = {{1, 2, 3, 1}, {5, 7, 9, 0}, {3, 99, 5, 0}};
        System.out.println("二维数组的行数：" + num.length);
        System.out.println("二维数组的列数：" + num[0].length);

        int[][] num1 = {{1, 1}, {5, 9, 0}, {3, 99, 5, 0}};
        System.out.println("二维数组第一行的列数：" + num1[0].length);
        System.out.println("二维  数组第二行的列数：" + num1[1].length);

        // 循环输出
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++)
                System.out.print(num1[i][j] + "  ");
            System.out.println();
        }

    }
}
