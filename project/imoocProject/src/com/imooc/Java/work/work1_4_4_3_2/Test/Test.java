package com.imooc.Java.work.work1_4_4_3_2.Test;

import com.imooc.Java.work.work1_4_4_3_2.Act.*;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 11:15
 * @注释：
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 选择看哪种表演
         */
        int n = 1;

        Menu menu = new Menu();
        menu.Menu();

        while (n == 1) {
            Scanner scanner = new Scanner(System.in);
            n = new Judge().JudgeN(scanner, menu);
        }
    }
}
