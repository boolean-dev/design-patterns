package com.tao.pattern.ch5singleton.eager;

/**
 * 饿汉式单例模式
 */
public class EagerSingleton {

    private static EagerSingleton instance  = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
