package com.tao.patterns.factory.pizza;

public class ChicagoPizzeStore extends PizzaStore {
    @Override
    public Pizza createPizze(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new ChicagoCheesePizza();
        }else if ("clam".equals(type)){
            pizza = new ChicagoClamPizza();
        }else if ("pepperoni".equals(type)) {
            pizza = new ChicagoPepperoniPizza();
        }else if ("veggie".equals(type)){
            pizza = new ChicagoVeggiePizza();
        }else return null;

        return pizza;
    }
}
