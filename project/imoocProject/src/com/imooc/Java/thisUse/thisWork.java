package com.imooc.Java.thisUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/8 20:32
 * @注释：
 */
public class thisWork {
    int x, y;

    public thisWork(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        thisWork thisWork1, thisWork2;
        thisWork1 = new thisWork(3, 3);
        thisWork2 = new thisWork(4, 4);
        System.out.println(thisWork1.x + "  " + thisWork2.y);
        System.out.println(thisWork1.x + thisWork2.y);
    }
}
