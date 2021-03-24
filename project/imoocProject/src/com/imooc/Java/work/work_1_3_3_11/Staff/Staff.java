package com.imooc.Java.work.work_1_3_3_11.Staff;

import com.imooc.Java.work.work_1_3_3_11.Department.Department;
import com.imooc.Java.work.work_1_3_3_11.Post.Post;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/18 14:36
 * @注释： 员工类
 */
public class Staff {
    /**
     * 员工姓名
     */
    private String name;

    /**
     * 工号
     */
    private String num;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private int age;

    /**
     * 部门
     */
    private Department department;

    /**
     * 职务
     */
    private Post post;


    public Staff() {

    }

    public Staff(String name, String num, String sex, int age) {
        this.name = name;
        this.num = num;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女"))
            this.sex = sex;
        else
            this.sex = "男";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65)
            age = 18;
        this.age = age;
    }

    public Post getPost() {
        return post;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if(department == null)
            this.department = new Department();
        this.department = department;
    }

    /**
     * 获取专业对象，如果没有初始化，则先进行初始化
     * @param post 职务
     */
    public void setPost(Post post) {
        if (post == null)
            this.post = new Post();
        this.post = post;
    }

    /**
     * @return 员工基本信息
     */
    public String introuduction() {
        String str = "姓名：" + this.getName() + "\n工号：" + this.getNum() + "\n性别：" + this.getSex()
                + "\n年龄：" + this.getAge() + "\n职务：" + this.getDepartment().getDepartmentName()
                + this.getPost().getPostName();
        return str;
    }
}
