package com.imooc.Java.CollectionMapUse.work;

import java.util.Objects;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/8 14:36
 * @注释： 学生类
 */
public class Student {
    /**
     * 学号
     */
    private String stuNum;
    /**
     * 姓名
     */
    private String stuName;
    /**
     * 数学成绩
     */
    private float math;
    /**
     * 语文成绩
     */
    private float chinese;

    public Student() {

    }

    public Student(String stuNum, String stuName) {
        this.setStuNum(stuNum);
        this.setStuName(stuName);
    }

    public Student(String stuNum, String stuName, float math, float chinese) {
        this.setStuNum(stuNum);
        this.setStuName(stuName);
        this.setMath(math);
        this.setChinese(chinese);
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        Student student = (Student) o;
//        return Float.compare(student.getMath(), getMath()) == 0 && Float.compare(student.getChinese(), getChinese()) == 0 && Objects.equals(getStuNum(), student.getStuNum()) && Objects.equals(getStuName(), student.getStuName());
        if (this == o)
            return true;
        if (o.getClass() == Student.class) {
            Student student = (Student) o;
            return student.getStuNum().equals(stuNum);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStuNum());
    }

    @Override
    public String toString() {
        return "学号：" + stuNum + "     姓名：" + stuName + "     数学：" + math + "     语文：" + chinese;
    }
}
