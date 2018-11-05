package com.tao.design.duck;

import com.tao.design.fly.FlyNoWay;
import com.tao.design.quanck.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
}
