package com.imooc.Java.packageUse.Test;

// 导入包的两种方法:一、导入包内的所有方法；二、导入包内的某一方法
//import com.imooc.Java.packageUse.*;
import com.imooc.Java.packageUse.A.Cat;
// 不能导入另一个包内相同方法名的类，但是可以使用*代替
//import com.imooc.Java.packageUse.B.Cat;
// 使用*号之后，Cat cat = new Cat();默认为上边的方法，以更具体的方法为主，调用该包内的方法，仍需要使用com.imooc.packageUse.B.Cat();

// 此语句错误，不能导入com.imooc.packageUse下的所有子包
// 通过.*的方法加载，只能加载该包下的类，不能找子包中的类


/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/11 18:14
 * @注释：
 */
public class Test {
    public static void main(String[] args) {
        // 若想使用其它包中的方法，一、需使用import导入包
        Cat cat = new Cat();
        // 二、使用包名.方法名调用方法
        com.imooc.Java.packageUse.B.Cat cat1 = new com.imooc.Java.packageUse.B.Cat();
    }

}
