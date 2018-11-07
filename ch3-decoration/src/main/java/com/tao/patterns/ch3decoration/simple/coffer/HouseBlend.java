package com.tao.patterns.ch3decoration.simple.coffer;

import com.tao.patterns.ch3decoration.simple.Beverage;

public class HouseBlend extends Beverage {

    private double price = 30.0d;

    public HouseBlend() {
        desc = "家庭咖啡：￥30";
    }

    @Override
    public double cost() {
        return 0;
    }
}
