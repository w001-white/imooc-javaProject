package com.imooc.Java.method;

/**
 * @Author 旺
 * @Date 2021/1/4 22:28
 * 注释：查找数组中的值
 */
public class search {

    public boolean search(char s, char[] a){
        boolean flag = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] == s){
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * 除main方法外，在同一个类中调用方法不需要使用对象调用，可以直接使用方法名使用
     */
    public void search(){
        char[] c = {'a', 'v', 'f', 'd'};
        char s = 'a';
        boolean flag = search(s , c);
        if(flag)
            System.out.println("找到了!");
        else
            System.out.println("没有找到!");
    }

    public static void main(String[] args) {
        char[] c = {'a', 'v', 'f', 'd'};
        char s = 'a';
        search search = new search();
        boolean flag = search.search(s , c);
        if(flag)
            System.out.println("找到了");
        else
            System.out.println("没有找到");
        search.search();
    }
}
