package com.tao.patterns.factory.pizza;

public class ChicagoPepperoniPizza extends Pizza {

    public ChicagoPepperoniPizza() {
        name = "ChicagoPepperoniPizza";
    }

    @Override
    public void cut() {
        System.out.println("芝加哥----------cut ChicagoPepperoniPizza");
    }
}
