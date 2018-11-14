package com.tao.pattern.ch5singleton.enums;

public class Singleton {
    private String name;

    public void print(){
        System.out.println("单例模式 name=" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
