package com.tao.patterns.factory.pizza;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        ChicagoPizzeStore chicagoPizzeStore = new ChicagoPizzeStore();

        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza chicagoCheesePizze =  chicagoPizzeStore.createOrder("cheese");
        System.out.println(chicagoCheesePizze.getName());

        Pizza chicagoClamPizze = chicagoPizzeStore.createOrder("clam");
        System.out.println(chicagoClamPizze.getName());


        Pizza nyPepperoniPizza = nyPizzaStore.createOrder("pepperoni");
        System.out.println(nyPepperoniPizza.getName());

        Pizza nyVeggiePizze = nyPizzaStore.createOrder("veggie");
        System.out.println(nyVeggiePizze.getName());





    }
}
