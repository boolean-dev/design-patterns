package com.tao.patterns.factory.pizza;

public class NYClamPizza extends Pizza {

    public NYClamPizza() {
        name = "NYClamPizza";
    }

    @Override
    public void cut() {
        System.out.println("纽约----------cut NYClamPizza");
    }
}
