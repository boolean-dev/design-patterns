package com.tao.patterns.factory.pizza;

public class NYPepperoniPizza extends Pizza {

    public NYPepperoniPizza() {
        name = "NYPepperoniPizza";
    }

    @Override
    public void cut() {
        System.out.println("纽约----------cut NYPepperoniPizza");
    }
}
