package com.tao.patterns.ch3decoration.simple.condiment;

import com.tao.patterns.ch3decoration.simple.Beverage;

/**
 * 调味料抽象类
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDesc();

    public abstract double cost();
}
