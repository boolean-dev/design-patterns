package com.tao.patterns.factory.pizza;

abstract public class PizzaStore {

    public Pizza createOrder(String type){
        Pizza pizza;
        pizza = createPizze(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract public Pizza createPizze(String type);
}
