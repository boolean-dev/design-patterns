package com.tao.patterns.ch3decoration.simple.condiment;

import com.tao.patterns.ch3decoration.simple.Beverage;

/**
 * 调料-摩卡
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;
    private double price = 5.0d;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + "\n调料-摩卡:￥5.0\n";
    }

    @Override
    public double cost() {
        return price + beverage.cost();
    }
}
