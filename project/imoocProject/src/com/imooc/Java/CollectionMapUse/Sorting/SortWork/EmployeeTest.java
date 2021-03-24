package com.imooc.Java.CollectionMapUse.Sorting.SortWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 0:07
 * @注释：
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("l001","yy",1800);
        Employee employee2 = new Employee("l003","ss",2500);
        Employee employee3 = new Employee("l002","sdd",2000);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        System.out.println("排序前");
        for (Employee employee : list){
            System.out.println(employee);
        }

        System.out.println("按工资排序后");
        Collections.sort(list);
        for (Employee employee : list){
            System.out.println(employee);
        }
    }
}
