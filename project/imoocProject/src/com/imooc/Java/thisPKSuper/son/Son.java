package com.imooc.Java.thisPKSuper.son;

import com.imooc.Java.thisPKSuper.father.Father;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/19 23:43
 * @注释：
 */
public class Son extends Father {

   public Son(){
        System.out.println("我是子类的无参构造方法");
    }

    public Son(String name){
        this();
        System.out.println(name);
    }

    @Override
    public void aa() {
        System.out.println("我是子类的");
    }
}
