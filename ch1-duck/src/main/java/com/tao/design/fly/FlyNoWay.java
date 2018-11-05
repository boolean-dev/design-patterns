package com.tao.design.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子不会飞");
    }
}
