package com.imooc.Java.work.work_1_3_3_11.Test;

import com.imooc.Java.work.work_1_3_3_11.Department.Department;
import com.imooc.Java.work.work_1_3_3_11.Post.Post;
import com.imooc.Java.work.work_1_3_3_11.Staff.Staff;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/18 14:36
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        // 初始化部门
        Department department1 = new Department("D001", "人事部");
        Department department2 = new Department("D002", "市场部");

        // 初始化职务
        Post post1 = new Post("P001", "经理");
        Post post2 = new Post("P002", "助理");
        Post post3 = new Post("P003", "职员");

//        System.out.println(department1.info());

        Staff staff1 = new Staff("张铭", "S001", "男", 29);
        staff1.setDepartment(department1);
        staff1.setPost(post1);
        System.out.println(staff1.introuduction());
        System.out.println("==============");

        Staff staff2 = new Staff("李艾爱", "S002", "女", 21);
        staff2.setDepartment(department1);
        staff2.setPost(post2);
        System.out.println(staff2.introuduction());
        System.out.println("==============");

        Staff staff3 = new Staff("孙超", "S003", "男", 29);
        staff3.setDepartment(department1);
        staff3.setPost(post3);
        System.out.println(staff3.introuduction());
        System.out.println("==============");

        Staff staff4 = new Staff("张美美", "S004", "女", 26);
        staff4.setDepartment(department2);
        staff4.setPost(post3);
        System.out.println(staff4.introuduction());
        System.out.println("==============");

        Staff staff5 = new Staff("蓝迪", "S005", "男", 37);
        staff5.setDepartment(department2);
        staff5.setPost(post1);
        System.out.println(staff5.introuduction());
        System.out.println("==============");

        Staff staff6 = new Staff("米莉", "S006", "女", 24);
        staff6.setDepartment(department2);
        staff6.setPost(post3);
        System.out.println(staff6.introuduction());
        System.out.println("==============");

        department1.addStaff(staff1);
        department1.addStaff(staff2);
        department1.addStaff(staff3);
        System.out.println(department1.getDepartmentName() + "总共有" + department1.getNumber() + "名员工");

        department2.addStaff(staff4);
        department2.addStaff(staff5);
        department2.addStaff(staff6);
        System.out.println(department2.getDepartmentName() + "总共有" + department2.getNumber() + "名员工");
    }
}
