package com.imooc.Java.work.work1_3_4_2_8.Father;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 20:53
 * @注释：
 */
public class Father {
    /**
     * 工作名称
     */
    private String workName;
    /**
     * 工作内容
     */
    private String workContent;
    /**
     * 工作种类
     */
    private String sort;

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkName() {
        return workName;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Father() {

    }

    public Father(String sort, String workContent) {
        this.setSort(sort);
        this.setWorkContent(workContent);
    }

    public void Describe() {
        System.out.println(this.getSort() + "类信息测试：" + this.getWorkContent());
    }
}
