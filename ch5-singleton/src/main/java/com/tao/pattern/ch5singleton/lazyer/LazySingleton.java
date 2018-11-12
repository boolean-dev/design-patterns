package com.tao.pattern.ch5singleton.lazyer;

/**
 * 懒汉式单例模式
 * 线程安全
 */
public class LazySingleton {



    /**
     * 每次加载都进行线程同步，极其耗费资源
     */

    /*
    private static LazySingleton instance = null;
    synchronized public static LazySingleton getInstance() {
        if (instance == null ) {
            instance = new LazySingleton();
            return instance;
        }else {
            return instance;
        }
    }*/

    /**
     * 第一次加载进行线程同步
     * 使用volatile关键字，使得该变量可被多线程消费
     */

    volatile private static LazySingleton instance = null;
    public static LazySingleton getInstance() {
        //第一层判断
        if (instance == null) {
            //同步代码块
            synchronized (LazySingleton.class) {
                //第二层判断
                if (instance  == null ) {
                    instance = new LazySingleton();
                    return instance;
                }
            }
        }
        return instance;
    }

}
