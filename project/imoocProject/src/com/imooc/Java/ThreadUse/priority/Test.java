package com.imooc.Java.ThreadUse.priority;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 16:58
 * @注释：
 * Java为线程类提供了10个优先级
 * 优先级可以用整数1-10表示，超过范围会抛出异常
 * 主线程默认优先级为5
 * 数字越大优先级越高
 * 优先级高的线程不一定会比优先级低的线程先运行
 */
public class Test {
    static class Mythread extends Thread {
        String name;

        public Mythread(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println(name + "正在运行第" + i + "次");
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 优先级常量
         * MAX_PRIORITY:线程的最高优先级10
         * MIN_PRIORITY:线程的最低优先级1
         * NORM_PRIORITY:线程的默认优先级5
         */
        // 获取主线程优先级
        System.out.println("主线程优先级：" + Thread.currentThread().getPriority());

        // 自定义线程,执行存在随机性
        Mythread mythread1 = new Mythread("线程一");
//        mythread.setPriority(10);
        // 等同
        mythread1.setPriority(Thread.MAX_PRIORITY);
        mythread1.start();
        System.out.println(mythread1.name + "的优先级：" + mythread1.getPriority());

        Mythread mythread2 = new Mythread("线程二");
        mythread2.setPriority(Thread.MIN_PRIORITY);
        mythread2.start();
    }
}
