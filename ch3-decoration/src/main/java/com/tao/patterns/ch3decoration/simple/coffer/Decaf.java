package com.tao.patterns.ch3decoration.simple.coffer;

import com.tao.patterns.ch3decoration.simple.Beverage;

/**
 * 低卡咖啡
 */
public class Decaf extends Beverage {

    private double price = 20.0d;

    public Decaf() {
        desc = "低卡咖啡:￥20\n";
    }

    @Override
    public double cost() {
        return price;
    }
}
