package com.imooc.Java.GenericUse.GenericClassUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 16:45
 * @注释： 泛型类，自定义泛型的定义以及使用
 */
public class OneGenericClassUse<T> {
    // 定义自定义泛型
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public static void main(String[] args) {
        OneGenericClassUse<Integer> genericClassUse = new OneGenericClassUse<>();
        genericClassUse.setNum(10);
        System.out.println("Integer="+genericClassUse.getNum());

        OneGenericClassUse<Float> genericClassUse1 = new OneGenericClassUse<>();
        genericClassUse1.setNum(0.5f);
        System.out.println("Float ="+genericClassUse1.getNum());
    }
}
