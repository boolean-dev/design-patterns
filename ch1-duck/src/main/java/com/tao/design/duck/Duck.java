package com.tao.design.duck;

import com.tao.design.fly.FlyBehavior;
import com.tao.design.quanck.QuackBehavior;

public class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /*
    正常情况
     */

    public void proformQuack() {
        flyBehavior.fly();
    }

    public void proformFly () {
        quackBehavior.quack();
    }

    public void setFlyBehavior (FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swing() {
        System.out.println("鸭子游泳");
    }
}
