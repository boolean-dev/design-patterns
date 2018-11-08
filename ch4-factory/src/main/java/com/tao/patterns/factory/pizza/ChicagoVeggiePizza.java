package com.tao.patterns.factory.pizza;

public class ChicagoVeggiePizza extends Pizza {

    public ChicagoVeggiePizza() {
        name = "ChicagoVeggiePizza";
    }

    @Override
    public void cut() {
        System.out.println("芝加哥----------cut ChicagoVeggiePizza");
    }
}
