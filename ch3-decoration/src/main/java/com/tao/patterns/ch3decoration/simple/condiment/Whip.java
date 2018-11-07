package com.tao.patterns.ch3decoration.simple.condiment;

import com.tao.patterns.ch3decoration.simple.Beverage;

/**
 * 调料-奶油
 */
public class Whip  extends CondimentDecorator {

    private Beverage beverage;
    private double price = 6.0d;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + "\n调料-奶油:￥6.0\n";
    }

    @Override
    public double cost() {
        return price + beverage.cost();
    }
}
