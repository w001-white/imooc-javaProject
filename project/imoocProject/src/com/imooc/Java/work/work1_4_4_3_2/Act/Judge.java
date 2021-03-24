package com.imooc.Java.work.work1_4_4_3_2.Act;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 23:12
 * @注释： 输入正确性的判断
 */
public class Judge {
    public Judge() {
    }

    public int JudgeN(Scanner scanner, Menu menu) {
        int n;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            if (n == 1 || n == 2 || n == 3 || n == 4 || n == 5) {
                menu.Switch(n);
                System.out.println("*******   是否继续观看（1/其它数字）   ******");
                n = scanner.nextInt();
                if (n != 1) return 0;
                menu.Menu();
            } else {
                System.out.println("请输入1~5的数字");
            }
        } else {
            System.out.println("请输入1~5的数字");
        }
        return 1;
    }
}
