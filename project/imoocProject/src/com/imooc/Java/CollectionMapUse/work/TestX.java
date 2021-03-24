package com.imooc.Java.CollectionMapUse.work;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/8 14:59
 * @注释： 临时测试
 */
public class TestX {
    // 学生类测试
    public void stedentTest() {
        // 添加学生信息
        Student s1 = new Student("s001", "花花", 80.7f, 70.2f);
        Student s2 = new Student("s002", "苏苏", 70.7f, 80.2f);
        Student s3 = new Student("s003", "红红", 70.7f, 50.2f);
        Student s4 = new Student("s003", "明明", 60.7f, 30.2f);
//        System.out.println(s1);
//        System.out.println("s002==s003?" + (s2.equals(s3))); // false
//        System.out.println("s003==s004?" + (s3.equals(s4)));// true
        BanJi banJi = new BanJi("b001", "实验班");
        banJi.addStudent(s1);
        banJi.addStudent(s2);
        banJi.addStudent(s3);
        banJi.addStudent(s4);
        banJi.displayAllStudent();

        // 通过学号查询该学生是否在班级中
        Student student = banJi.searchStudentByNum("s002");
//        Student student1 = banJi.searchStudentByNum("s005");
        if (student == null) {
            System.out.println("经查询该学生不存在，请核实后查询");
        } else {
            System.out.println("经查询该生信息如下：\n" + student);
        }

        // 添加语文成绩
        banJi.insertChineseScore("s001", 20f);
        System.out.println(s1);

        // 添加数学成绩
        banJi.insertMathScore("s001", 20f);
        System.out.println(s1);

        // 删除学生信息
        banJi.deleteStudent("s002");
        banJi.deleteStudent("s005");
        banJi.displayAllStudent();
    }

    // school测试
    public void schoolTest(){
        Student s1 = new Student("s001", "花花", 80.7f, 70.2f);
        Student s2 = new Student("s002", "苏苏", 70.7f, 80.2f);
        Student s3 = new Student("s003", "红红", 70.7f, 50.2f);
        BanJi banJi = new BanJi("b001", "实验班");
        banJi.addStudent(s1);
        banJi.addStudent(s2);
        banJi.addStudent(s3);

        BanJi banJi1 = new BanJi("b002","潜力班");
        banJi1.addStudent(new Student("s004", "枚枚", 100f, 100f));
        banJi1.addStudent(new Student("s005", "美美", 50f, 60f));
        banJi1.displayAllStudent();

        School school = new School();
        school.addBanJi(banJi);
        school.addBanJi(banJi1);

        school.deleteBanji(banJi1);
        school.sortChineseByAverage();
        school.sortMathByAverage();
        school.displayBanJiName();
    }

}
