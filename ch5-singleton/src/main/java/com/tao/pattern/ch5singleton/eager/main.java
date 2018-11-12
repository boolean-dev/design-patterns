package com.tao.pattern.ch5singleton.eager;

public class main {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();


        System.out.println(eagerSingleton1 == eagerSingleton2);
    }
}
