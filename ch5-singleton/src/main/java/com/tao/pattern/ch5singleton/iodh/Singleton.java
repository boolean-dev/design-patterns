package com.tao.pattern.ch5singleton.iodh;

/**
 * IoDH
 * (Initialization-on-demand holder)
 * 使用内部类实现单例模式
 */
public class Singleton {

    public Singleton() {
    }

    private static class HolderClass{
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
