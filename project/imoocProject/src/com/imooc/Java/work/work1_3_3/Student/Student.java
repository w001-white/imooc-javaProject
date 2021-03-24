package com.imooc.Java.work.work1_3_3.Student;

import com.imooc.Java.work.work1_3_3.School.Major;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/16 16:55
 * @注释：
 */
public class Student {
    /**
     * 姓名
     */
    private String name;

    /**
     * 学号
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
     * 学生所学专业
     */
    private Major major;

    public Student() {

    }

    /**
     * 多参构造方法实现对成员变量的赋值
     *
     * @param name 姓名
     * @param num  学号
     * @param sex  性别
     * @param age  年龄
     */
    public Student(String name, String num, String sex, int age) {
        this.setName(name);
        this.setNum(num);
        this.setSex(sex);
        this.setAge(age);
    }

    /**
     * 多参构造方法实现对成员变量的赋值,在方法中通过对象作为参数，传递的是它的引用,可以通过引用获取该对象所有信息。
     *
     * @param name  姓名
     * @param num   学号
     * @param sex   性别
     * @param age   年龄
     * @param major 专业相关的信息
     */
    public Student(String name, String num, String sex, int age, Major major) {
        this.setName(name);
        this.setNum(num);
        this.setSex(sex);
        this.setAge(age);
        this.setMajor(major);
    }

    //    public Student(String name, String num, String sex, int age) {
//        System.out.println("学生信息如下：");
//        System.out.println("姓名：" + name);
//        System.out.println("学号：" + num);
//        System.out.println("性别：" + sex);
//        System.out.println("年龄：" + age);
//        System.out.println("所报专业：计算机科学与应用");
//        System.out.println("学制年限：4");
//        System.out.println("====================");
//    }


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

    public Major getMajor() {
        return major;
    }

    /**
     * 获取专业对象，如果没有实例化，先实例化再返回;
     * 引用数据类型:如未进行实例化，方法中调用对象非私有成员时会报空指针异常﹔当进行初始化后，可借由对象访问其非私有成员信息。
     *
     * @param major
     */
    public void setMajor(Major major) {
        if (major == null)
            this.major = new Major();
        this.major = major;
    }

    /**
     * 限制性别必须为男或女，否则赋值为男
     * 1、setSex方法中，如果将equals修改为"==”，虽然不影响本段程序的运行结果，但表示的是对象引用是否一致，
     * 此处建议用equals进行对象内容的比较，相关内容在后面的字符串课程中会有详细介绍，敬请关注~~
     * 2、在目前的代码中setSex中，通过|实现性别条件的判断，也可以通过&&判断，此时代码修订可参考，
     * 请注意其中!运算符的结合运用，表示不等于男，同时不等于女:
     *
     * @param sex 传入性别
     */
    public void setSex(String sex) {
//        if(!sex.equals("男") && !sex.equals("女"))
//            this.sex = "男";
//        else
//            this.sex = sex;
        if (sex.equals("男") || sex.equals("女"))
            this.sex = sex;
        else
            this.sex = "男";
    }

    public int getAge() {
        return age;
    }

    /**
     * 给年龄进行限制再10-100之间，否则赋值为18
     *
     * @param age 传入年龄
     */
    public void setAge(int age) {
        if (age < 10 || age > 100)
            this.age = 18;
        else
            this.age = age;
    }

    public String introuduction() {
        String str = "学生信息如下：\n姓名：" + getName() + "\n学号：" + getNum()
                + "\n性别：" + getSex() + "\n年龄：" + getAge()
                + "\n所报专业名称：" + this.getMajor().getSubjectName() + "\n学制年限" + this.getMajor().getSubjectLife();
        return str;
    }

    /**
     * @param subjectName 专业名称
     * @param subjectLife 学制年限
     * @return 学生基础信息
     */
    public String introuduction(String subjectName, int subjectLife) {
        String str = "学生信息如下：\n姓名：" + getName() + "\n学号：" + getNum() + "\n性别：" + getSex()
                + "\n年龄：" + getAge() + "\n所报专业名称：" + subjectName + "\n学制年限" + subjectLife;
        return str;
    }

    /**
     * @param major 所选专业的对象
     * @return
     */
    public String introuduction(Major major) {
        String str = "学生信息如下：\n姓名：" + getName() + "\n学号：" + getNum() + "\n性别：" + getSex() + "\n年龄："
                + getAge() + "\n所报专业名称：" + major.getSubjectName() + "\n学制年限" + major.getSubjectLife();
        return str;
    }
}
