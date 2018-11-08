package com.tao.patterns.factory.pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "ChicagoCheesePizza";
    }

    @Override
    public void cut() {
        System.out.println("芝加哥----------cut ChicagoCheesePizza");
    }
}
