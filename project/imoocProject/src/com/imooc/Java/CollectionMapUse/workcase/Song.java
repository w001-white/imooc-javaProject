package com.imooc.Java.CollectionMapUse.workcase;

import java.util.Objects;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/3/2 20:09
 * @注释： 歌舞类
 */
public class Song {
    // 歌曲id
    private String id;
    // 歌曲名字
    private String name;
    // 演唱者
    private String singer;

    public Song(String id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        // 判断对象是否相等，相等则直接返回true
        if (this == o)
            return true;
        // this !=o
//        if(o instanceof Song){
        if (o.getClass() == Song.class) {
            Song song = (Song) o;
            return ((song.getId().equals(id)) && (song.getName().equals(name)) && (song.getSinger().equals(singer)));
        }
        return false;

//        if (this == o) return true;
//        if (!(o instanceof Song)) return false;
//        Song song = (Song) o;
//        return Objects.equals(getId(), song.getId()) && Objects.equals(getName(), song.getName()) && Objects.equals(getSinger(), song.getSinger());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSinger());
    }

    @Override
    public String toString() {
        return "歌曲信息 ：id为" + id + ", 歌曲名称为：" + name + ", 演唱者为：" + singer;
    }
}
