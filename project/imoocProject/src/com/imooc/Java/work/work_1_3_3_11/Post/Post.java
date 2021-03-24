package com.imooc.Java.work.work_1_3_3_11.Post;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/18 14:36
 * @注释： 职务类
 */
public class Post {
    /**
     * 职务编号
     */
    private String postNum;

    /**
     * 职务名称
     */
    private String postName;

    public Post(){

    }

    public Post(String postNum, String postName){
        this.setPostNum(postNum);
        this.setPostName(postName);
    }

    public String getPostNum() {
        return postNum;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
       this.postName = postName;
    }
}
