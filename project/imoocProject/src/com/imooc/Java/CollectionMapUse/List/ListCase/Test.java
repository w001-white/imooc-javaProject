package com.imooc.Java.CollectionMapUse.List.ListCase;

import java.util.ArrayList;
import java.util.Date;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/4 12:08
 * @注释：
 */
public class Test {

    public static void Print(ArrayList notice){
        // 显示公告
        System.out.println("公告的内容如下：");
        for (int i = 0; i < notice.size(); i++) {
            // 报错：原因是notice4.get(i)返回的是Object类型，Object是所有类的父类，所以无法调用Notice中的方法
//            notice.get(i).getId();
            System.out.println(i + 1 + ":" + ((Notice) (notice.get(i))).getTitle());
        }
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        // 创建Notice对象，生成三条公告
        Notice notice1 = new Notice(001, "欢迎来到慕课网", "管理员", new Date());
        Notice notice2 = new Notice(002, "请同学们按时提交作业", "老师", new Date());
        Notice notice3 = new Notice(003, "考勤签到", "老师", new Date());

        // 添加公告
        ArrayList notice = new ArrayList();
        notice.add(notice1);
        notice.add(notice2);
        notice.add(notice3);

        // 显示公告
        Print(notice);

        // 在第一条公告后边添加一个公告
        Notice notice4 = new Notice(004, "修改信息", "管理员", new Date());
        notice.add(1,notice4);
        Print(notice);

        // 删除公告
        notice.remove(2);
        Print(notice);

        notice.remove(notice1);
        Print(notice);

        // 将第一条公告改为:Java在线编辑器可以使用啦!
        notice4.setTitle("Java在线编辑器可以使用啦!");
        notice.set(0,notice4);
        Print(notice);
    }
}
