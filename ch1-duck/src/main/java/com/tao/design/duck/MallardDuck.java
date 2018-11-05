package com.tao.design.duck;

import com.tao.design.fly.FlyWithWings;
import com.tao.design.quanck.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


}
