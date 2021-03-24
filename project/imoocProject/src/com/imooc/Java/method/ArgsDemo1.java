package com.imooc.Java.method;

/**
 * @Author 旺
 * @Date 2021/1/5 17:53
 * 注释：
 */
public class ArgsDemo1 {
    // 查找,若方法中变量是多个，则可变参数放在最后一个
    // 定义可变参数之后，不能定义同种类型的数组类型的方法
//    public void search(int n, int[] s){ }

    public void search(int n,int... a){
        boolean flag = false;
        for (int i : a){
            if (i == n){
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        ArgsDemo1 search = new ArgsDemo1();
        search.search(1,1,2,3,5,4);
        int[] a={1,2,3,5,4};
        search.search(6,a);
    }
}
