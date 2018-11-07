package com.tao.patterns.ch3decoration.simple.condiment;

import com.tao.patterns.ch3decoration.simple.Beverage;

/**
 * 调料-牛奶
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;
    private double price = 3.0d;

    public Milk() {
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + "调料-牛奶:￥3.0\n";
    }

    @Override
    public double cost() {
        return price + beverage.cost();
    }
}
