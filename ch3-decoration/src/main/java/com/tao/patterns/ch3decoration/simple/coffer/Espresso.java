package com.tao.patterns.ch3decoration.simple.coffer;

import com.tao.patterns.ch3decoration.simple.Beverage;

/**
 * 浓咖啡
 */
public class Espresso extends Beverage {

    private double price;

    public Espresso() {
        desc = "浓咖啡：￥35";
    }

    @Override
    public double cost() {
        return price;
    }
}
