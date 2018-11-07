package com.tao.patterns.ch3decoration.simple.coffer;

import com.tao.patterns.ch3decoration.simple.Beverage;

/**
 * 深度烘焙咖啡
 */
public class DarkRoast extends Beverage {

    private double price = 25.0d;

    public DarkRoast() {
        desc = "深度烘焙咖啡：￥25";
    }

    @Override
    public double cost() {
        return price;
    }
}
