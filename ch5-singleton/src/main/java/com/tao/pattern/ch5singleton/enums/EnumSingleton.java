package com.tao.pattern.ch5singleton.enums;

public enum  EnumSingleton {
    SINGLETON;

    private Singleton singleton;

    EnumSingleton(){
        System.out.println("初始化...");
        singleton = new Singleton();
    }

    public Singleton getInstance() {
        return singleton;
    }
}
