package com.tao.patterns.ch3decoration.simple;


/**
 * 所有饮料的父类
 */
public abstract class Beverage {
    protected String desc = "未知饮料";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}
