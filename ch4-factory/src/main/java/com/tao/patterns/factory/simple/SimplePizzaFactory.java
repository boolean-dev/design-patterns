package com.tao.patterns.factory.simple;

public class SimplePizzaFactory {

    Pizza pizza;

    public Pizza createPizza (String type) {
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        }else if ("clam".equals(type)){
            pizza = new ClamPizza();
        }else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        }else if ("veggie".equals(type)){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
