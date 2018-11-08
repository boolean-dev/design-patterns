package com.tao.patterns.factory.pizza;

public class NYVeggiePizza extends Pizza {

    public NYVeggiePizza() {
        name = "NYVeggiePizza";
    }

    @Override
    public void cut() {
        System.out.println("纽约----------cut NYVeggiePizza");
    }
}
