package com.imooc.Java.work.work_1_3_3_11.Department;

import com.imooc.Java.work.work_1_3_3_11.Staff.Staff;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/18 14:36
 * @注释： 部门类
 */
public class Department {
    /**
     * 部门编号
     */
    private String departmentNum;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 存储部门的人的信息
     */
    private Staff[] staffNum;

    /**
     * 部门人数
     */
    private int number;

    // 无参构造
    public Department() {

    }

    // 有参构造，获取部门编号、部门名称
    public Department(String DepartmentNum, String DepartmentName) {
        this.setDepartmentNum(DepartmentNum);
        this.setDepartmentName(DepartmentName);
    }

    public String getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Staff[] getStaffNum() {
        if (staffNum == null)
            this.staffNum = new Staff[10];
        return staffNum;
    }

    public void setStaffNum(Staff[] staffNum) {
        this.staffNum = staffNum;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return 部门及部门编号
     */
    public String info() {
        String str = "部门名称：" + this.getDepartmentName() + "\n部门编号：" + this.departmentNum;
        return str;
    }

    /**
     * 记录部门职工到数组中
     *
     * @param staff 各部门职工
     */
    public void addStaff(Staff staff) {
        for (int i = 0; i < this.getStaffNum().length; i++) {
            if (this.getStaffNum()[i] == null) {
                // 将职员信息存在数组中
                this.getStaffNum()[i] = staff;
                // 记录职员人数
                this.number = i + 1;
                return;
            }
        }
    }
}
