package com.tao.design.quanck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子不会叫");
    }
}
