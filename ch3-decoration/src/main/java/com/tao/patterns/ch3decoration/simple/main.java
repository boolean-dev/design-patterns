package com.tao.patterns.ch3decoration.simple;

import com.tao.patterns.ch3decoration.simple.coffer.DarkRoast;
import com.tao.patterns.ch3decoration.simple.coffer.Decaf;
import com.tao.patterns.ch3decoration.simple.condiment.Milk;
import com.tao.patterns.ch3decoration.simple.condiment.Mocha;
import com.tao.patterns.ch3decoration.simple.condiment.Soy;
import com.tao.patterns.ch3decoration.simple.condiment.Whip;

/**
 * 主类
 */
public class main {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getDesc());
        System.out.println("总共花费:￥" + darkRoast.cost());

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Soy(decaf);
        decaf = new Mocha(decaf);
        decaf = new Whip(decaf);

        System.out.println(decaf.getDesc());
        System.out.println("总共花费:￥" + decaf.cost());


    }
}
