package com.tao.patterns.factory.pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizze(String type) {

        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza();
        }else if ("clam".equals(type)){
            pizza = new NYClamPizza();
        }else if ("pepperoni".equals(type)) {
            pizza = new NYPepperoniPizza();
        }else if ("veggie".equals(type)){
            pizza = new NYVeggiePizza();
        }else return null;

        return pizza;
    }
}
