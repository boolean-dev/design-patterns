package com.tao.design.main;

import com.tao.design.duck.Duck;
import com.tao.design.duck.MallardDuck;
import com.tao.design.duck.ModelDuck;
import com.tao.design.duck.RockDuck;
import com.tao.design.fly.FlyNoWay;
import com.tao.design.quanck.Squack;

public class main {

    public static void main(String[] args) {

        /**
         * 普通方法测试
         */

        /*Duck mallardDuck = new MallardDuck();
        mallardDuck.swing();
        mallardDuck.proformFly();
        mallardDuck.proformQuack();*/

       /* Duck  modelDuck = new ModelDuck();
        modelDuck.swing();
        modelDuck.proformQuack();
        modelDuck.proformFly();*/

        /**
         * 动态绑定
         */

        Duck duck = new RockDuck();
        duck.swing();
        duck.proformQuack();
        duck.proformFly();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Squack());
        duck.proformFly();
        duck.proformQuack();
    }
}
