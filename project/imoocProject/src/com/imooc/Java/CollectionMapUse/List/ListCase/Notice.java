package com.imooc.Java.CollectionMapUse.List.ListCase;

import java.util.Date;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/4 12:07
 * @注释：
 */
public class Notice {
    /**
     * ID
     */
    private int id;

    /**
     * 标题
     */
    private String title;

    /**
     * 创始人
     */
    private String create;

    /**
     * 创建时间
     */
    private Date createTime;

    public Notice(int id, String title, String create, Date createTime) {
        this.setId(id);
        this.setTitle(title);
        this.setCreate(create);
        this.setCreateTime(createTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
