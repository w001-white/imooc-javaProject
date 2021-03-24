package com.imooc.Java.CollectionMapUse.work;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/8 14:27
 * @注释：
 */
public class Test {
    public Test() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        BanJi banJi = new BanJi("d001", "普通班");
        while (true) {
            menu.mainMenu();
            int switchMain = menu.PanDuanMain();
            if (switchMain == 0) {
                break;
            }
            switch (switchMain) {
                case 1:
                    while (true) {
                        menu.BanJiMenu();
                        System.out.print("请输入对应数字对班级的管理：");
                        int switchBanJI = menu.PanDuanBanJI();
                        if (switchBanJI == 9)
                            break;
                        switch (switchBanJI) {
                            case 1:
                                System.out.print("请选择添加的人数：");
                                int addStuNum = sc.nextInt();
                                for (int i = 0; i < addStuNum; i++) {
                                    System.out.print("请输入学生的学号：");
                                    String stuNum = sc.next();
                                    System.out.print("请输入学生的姓名：");
                                    String stuName = sc.next();
                                    Student student = new Student(stuNum, stuName);
                                    banJi.addStudent(student);
                                }
                                break;
                            case 2:
                                System.out.print("请输入您所要查询的学生学号：");
                                String stuNum = sc.next();
                                Student student = banJi.searchStudentByNum(stuNum);
                                if (student == null)
                                    System.out.println("该生不存在，请重新选择");
                                else System.out.println("该生存在");
                                break;
                            case 3:
                                System.out.print("请输入您所要输入成绩的学生学号：");
                                String stuChineseNum = sc.next();
                                Student student1 = banJi.searchStudentByNum(stuChineseNum);
                                if (student1 == null){
                                    System.out.println("该生不存在，请重新选择");
                                    break;
                                }

                                System.out.print("请输入您所要输入成绩的学生成绩：");
                                float stuChineseScore = sc.nextFloat();
                                banJi.insertChineseScore(stuChineseNum, stuChineseScore);
                                banJi.displayAllStudent();
                                break;
                            case 4:
                                System.out.print("请输入您所要输入成绩的学生学号：");
                                String stuMathNum = sc.next();
                                Student student2 = banJi.searchStudentByNum(stuMathNum);
                                if (student2 == null){
                                    System.out.println("该生不存在，请重新选择");
                                    break;
                                }

                                System.out.print("请输入您所要输入成绩的学生成绩：");
                                float stuMathScore = sc.nextFloat();
                                banJi.insertChineseScore(stuMathNum, stuMathScore);
                                banJi.displayAllStudent();
                                break;
                            case 5:
                                System.out.print("请输入你要删除学生的学号：");
                                String s = sc.next();
                                Student student3 = banJi.searchStudentByNum(s);
                                if (student3 == null){
                                    System.out.println("该生不存在，请重新选择");
                                    break;
                                }
                                banJi.deleteStudent(s);
                                break;
                            case 6:
                                banJi.displayAllStudent();
                                break;
                        }
                    }
            }

        }
    }

    public static void main(String[] args) {
        // Test
//        new TestX().stedentTest();
//        new TestX().schoolTest();
        new Test();

    }
}
