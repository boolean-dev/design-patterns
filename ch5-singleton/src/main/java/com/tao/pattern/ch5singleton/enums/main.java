package com.tao.pattern.ch5singleton.enums;

public class main {

    public static void main(String[] args) {
        Singleton singleton1 = EnumSingleton.SINGLETON.getInstance();
        singleton1.setName("1");
        singleton1.print();
        Singleton singleton2 = EnumSingleton.SINGLETON.getInstance();
        singleton2.setName("2");
        singleton2.print();
        Singleton singleton3 = EnumSingleton.SINGLETON.getInstance();
        singleton3.print();
        singleton3.setName("3");
        Singleton singleton4 = EnumSingleton.SINGLETON.getInstance();
        singleton4.print();
    }
}
