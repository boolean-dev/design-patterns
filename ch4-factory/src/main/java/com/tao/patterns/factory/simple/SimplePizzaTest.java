package com.tao.patterns.factory.simple;

public class SimplePizzaTest {



    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.createOrder("cheese");
        System.out.println(pizza.getName());
    }
}
