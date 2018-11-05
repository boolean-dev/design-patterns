package com.tao.design.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子飞---通过翅膀飞");
    }
}
