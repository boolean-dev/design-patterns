package com.tao.design.duck;

import com.tao.design.fly.RockFly;
import com.tao.design.quanck.MuteQuack;

public class RockDuck extends Duck {

    public RockDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new RockFly();
    }
}
