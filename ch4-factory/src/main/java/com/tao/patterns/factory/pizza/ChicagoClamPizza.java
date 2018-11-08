package com.tao.patterns.factory.pizza;

public class ChicagoClamPizza extends Pizza {

    public ChicagoClamPizza() {
        name = "ChicagoClamPizza";
    }

    @Override
    public void cut() {
        System.out.println("芝加哥----------cut ChicagoClamPizza");
    }
}
