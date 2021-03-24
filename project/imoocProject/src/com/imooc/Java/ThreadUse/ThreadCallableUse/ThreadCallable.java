package com.imooc.Java.ThreadUse.ThreadCallableUse;

import java.util.concurrent.Callable;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 15:38
 * @注释：
 */
public class ThreadCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "多线程的第三种创建方法";
    }
}
