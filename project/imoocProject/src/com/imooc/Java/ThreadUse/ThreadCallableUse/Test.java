package com.imooc.Java.ThreadUse.ThreadCallableUse;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 15:38
 * @注释：
 * 1、创建Callable接口的实现类，并实现call()方法，该call()方法将作为线程执行体，并且有返回值。
 * 2、创建Callable实现类的实例，使用FutureTask类来包装Callable对象，该FutureTask对象封装了该Callable对象的call()方法的返回值。
 * 3、使用FutureTask对象作为Thread对象的target创建并启动新线程。
 * 4、调用Future Task对象的get()方法来获得子线程执行结束后的返回值。
 */
public class Test {
    public static void main(String[] args) {
        Callable<String> callable = new ThreadCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);

        thread.start();

        // 获取Call方法的返回值:先启动线程才可以获取到Call的返回值
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
