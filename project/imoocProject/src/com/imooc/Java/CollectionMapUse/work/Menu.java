package com.imooc.Java.CollectionMapUse.work;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/8 23:52
 * @注释：
 */
public class Menu {
    /**
     * 主菜单
     */
    public void mainMenu() {
        System.out.println("*****************************************");
        System.out.println("              1、班级类                   ");
        System.out.println("              2、学校类                   ");
        System.out.println("              0、退出                   ");
        System.out.println("*****************************************");
    }

    /**
     * 主菜单判断输入格式是否正确
     * @return 主菜单上的选项
     */
    public int PanDuanMain() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int a = sc.nextInt();
                if (a == 1 || a == 2 || a == 0) {
                    return a;
                } else {
                    System.out.print("请输入正确选项（0-3）:");
                }
            } catch (InputMismatchException e) {
                System.out.print("输入格式错误，请重新输入:");
                sc.next();

            }
        }
    }

    /**
     * 班级菜单
     */
    public void BanJiMenu() {
        System.out.println("*****************************************");
        System.out.println("              1、将学生添加到班级中                   ");
        System.out.println("              2、通过学号查询学生所在的班级是否存在                   ");
        System.out.println("              3、输入班级学生的语文成绩                   ");
        System.out.println("              4、输入班级学生的数学成绩           ");
        System.out.println("              5、删除学生信息                   ");
        System.out.println("              6、显示所有学生信息                   ");
        System.out.println("              9、返回上一级                   ");
        System.out.println("*****************************************");
    }

    /**
     * 班级菜单判断输入格式是否正确
     * @return 班级菜单上的选项
     */
    public int PanDuanBanJI() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int a = sc.nextInt();
                if (a == 9) {
                    return 9;
                }
                if (a == 1 || a == 2 || a == 3 || a == 4 || a == 5 || a == 6 || a == 9) {
                    return a;
                } else {
                    System.out.print("请输入正确选项（1-6或者9）:");
                }
            } catch (InputMismatchException e) {
                System.out.print("输入格式错误，请重新输入:");
                sc.next();

            }
        }
    }
}
