package com.tao.patterns.ch3decoration.simple.condiment;

import com.tao.patterns.ch3decoration.simple.Beverage;

/**
 * 调料-豆子
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;
    private double price = 4.0d;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + "\n调料-豆子:￥4.0\n";
    }

    @Override
    public double cost() {
        return price + beverage.cost();
    }
}
