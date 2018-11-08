package com.tao.patterns.factory.pizza;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        name = "NYCheesePizza";
    }

    @Override
    public void cut() {
        System.out.println("纽约----------cut NYCheesePizza");
    }
}
