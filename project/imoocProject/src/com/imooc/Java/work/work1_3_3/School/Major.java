package com.imooc.Java.work.work1_3_3.School;

import com.imooc.Java.work.work1_3_3.Student.Student;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/16 17:09
 * @注释：
 */
public class Major {
    /**
     * 学科名称
     */
    private String subjectName;

    /**
     * 学科编号
     */
    private String subjectNo;

    /**
     * 学制年限
     */
    private int subjectLife;

    /**
     * 报名选修的学生信息
     */
    private Student[] myStudent;

    /**
     * 报名学生的人数
     */
    private int studentNum;

    // 无参构造方法
    public Major() {

    }

    // 带参构造，对学科名字、学科编号、学科年限赋值
    public Major(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    // 带参构造，对学科名字、学科编号、学科年限、选修人数赋值
    public Major(String subjectName, String subjectNo, int subjectLife, Student[] myStudent) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
        this.setMyStudent(myStudent);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    // 设置年限必须大于0
    public void setSubjectLife(int subjectLife) {
        if (subjectLife <= 0)
            return;
        this.subjectLife = subjectLife;
    }

    /**
     * 选修专业学生信息 如果保存学生数组未被初始化，则先被初始化10
     *
     * @return
     */
    public Student[] getMyStudent() {
        // 如果不添加实例化的语句，就会报空指针异常
        if (myStudent == null)
            this.myStudent = new Student[10];
        return myStudent;
    }

    public void setMyStudent(Student[] myStudent) {
        this.myStudent = myStudent;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * 专业介绍的方法
     *
     * @return 专业介绍的信息：专业名称、学科编号、学制年限
     */
    public String info() {
        String str = "专业信息如下：\n专业名称：" + getSubjectName() + "\n学科编号："
                + getSubjectNo() + "\n学制年限：" + getSubjectLife();
        return str;
    }

    /**
     * 1、将学生保存到数组中
     * 2、将学生个数保存到studentNum
     */
    public void addStudent(Student stu) {
        for (int i = 0; i < this.getMyStudent().length; i++) {
            if (getMyStudent()[i] == null) {
//                stu.setMajor(this);
                // 把学生信息存入数组中
                this.getMyStudent()[i] = stu;
                // 记录学生个数
                this.studentNum = i+1;
                return;
            }
        }
    }
}
