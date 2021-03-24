package com.imooc.Java.GenericUse.GenericClassUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/25 17:43
 * @注释： 多个参数的自定义泛型类
 */
public class TwoGenericClassUse<T, X> {
    private T num1;
    private X num2;

    public TwoGenericClassUse() {
    }

    public void GetGenericClassUse(T num1, X num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public X getNum2() {
        return num2;
    }

    public void setNum2(X num2) {
        this.num2 = num2;
    }

    public static void main(String[] args) {
        TwoGenericClassUse<Integer, Float> twoGenericClassUse = new TwoGenericClassUse<>();
        twoGenericClassUse.GetGenericClassUse(25, 2.0f);
        System.out.println("numb1="+twoGenericClassUse.getNum1());
        System.out.println("numb2="+twoGenericClassUse.getNum2());
    }
}
