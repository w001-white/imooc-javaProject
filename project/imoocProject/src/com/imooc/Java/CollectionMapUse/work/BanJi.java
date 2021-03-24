package com.imooc.Java.CollectionMapUse.work;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/8 14:36
 * @注释： 班级类
 */
public class BanJi {
    /**
     * 班级编号
     */
    private String classId;
    /**
     * 班级名称
     */
    private String className;
    /**
     * 学生集合
     */
    private List<Student> studendList;

    public BanJi() {

    }

    public BanJi(String classId, String className) {
        this.classId = classId;
        this.className = className;
        studendList = new ArrayList<>();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudendList() {
        return studendList;
    }

    public void setStudendList(List<Student> studendList) {
        this.studendList = studendList;
    }

    /**
     * 将学生信息添加到班级中
     * @param student 要添加的学生
     */
    public void addStudent(Student student) {
        // 排除重复学生
//        for (Student student1 : studendList){
//            if (student1.equals(student)){
//                System.out.println("存在该学号，请重新检查");
//                break;
//            }else {
//                studendList.add(student);
//                System.out.println("添加成功");
//            }
//        }
        boolean flag = false;
        for (Student student1 : studendList) {
            if (student1.equals(student)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("该学号存在，请核实后添加");
        } else {
            studendList.add(student);
            System.out.println("添加成功");
        }
    }


    /**
     * 通过学号查询学生在班级中是否存在
     * @param stuNum 学号
     * @return 学生信息
     */
    public Student searchStudentByNum(String stuNum) {
        Student student = null;
        for (Student student1 : studendList) {
            if (student1.getStuNum().equals(stuNum)) {
                return student1;
            }
        }
        return student;
    }

    /**
     * 输入班级学生语文成绩
     * @param stuNum 学号
     * @param score  成绩
     */
    public void insertChineseScore(String stuNum, float score) {
        for (Student student : studendList) {
            if (student.getStuNum().equals(stuNum)) {
                student.setChinese(score);
                System.out.println("添加成功");
                break;
            } else {
                System.out.println("添加成绩失败，该生不存在，请核实");
                break;
            }
        }
    }

    /**
     * 输入班级学生数学成绩
     * @param stuNum 学号
     * @param score  成绩
     */
    public void insertMathScore(String stuNum, float score) {
        for (Student student : studendList) {
            if (student.getStuNum().equals(stuNum)) {
                student.setMath(score);
                System.out.println("添加成功");
                break;
            } else {
                System.out.println("添加成绩失败，该生不存在，请核实");
                break;
            }
        }
    }

    /**
     * 删除学生信息
     * @param stuNum 学号
     */
    public void deleteStudent(String stuNum) {
        Student student = searchStudentByNum(stuNum);
        if (student != null) {
            studendList.remove(student);
            System.out.println("删除成功");
        } else {
            System.out.println("该生不存在");
        }

    }

    /**
     * 显示班级中所有学生的信息
     */
    public void displayAllStudent() {
        System.out.println("所有学生信息如下：");
        for (Student student : studendList) {
            System.out.println(student);
        }
    }
}
