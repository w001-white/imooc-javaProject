package com.imooc.Java.work.work1_3_3.Test;

import com.imooc.Java.work.work1_3_3.School.Major;
import com.imooc.Java.work.work1_3_3.Student.Student;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/16 16:55
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("专业信息如下：");
//        System.out.println("专业名称：计算机科学与应用");
//        System.out.println("专业编号：J0001");
//        System.out.println("学制年限：4年");
//        System.out.println("====================");
//        Student student =new Student("张三","S01","男",18);
//        Student student1 =new Student("李四","S02","女",17);
//        Student student2 =new Student("王五","S03","男",18);
        Major major = new Major("计算机科学与应用", "J0001", 4);
        System.out.println(major.info());
        System.out.println("====================");

        Student student1 = new Student("张三","S01","男",18, major);
        System.out.println(student1.introuduction());
        System.out.println("====================");

        Student student2 = new Student("李四","S02","女",17);
        System.out.println(student2.introuduction("计算机科学与应用", 4));
        System.out.println("====================");

        Student student3 = new Student("王五","S03","男",18    );
        System.out.println(student3.introuduction(major));
        System.out.println("====================");

        // 测试指定专业中学生人数
        major.addStudent(student1);
        major.addStudent(student2);
        major.addStudent(student3);
        System.out.println(major.getSubjectName() + "的专业报名人数：" + major.getStudentNum());
    }
}
