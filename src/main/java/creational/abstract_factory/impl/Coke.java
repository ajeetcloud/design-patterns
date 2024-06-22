package creational.abstract_factory.impl;

import creational.abstract_factory.Drink;

public class Coke implements Drink {

    @Override
    public void pour() {
        System.out.println("Pouring Coke");
    }
}
