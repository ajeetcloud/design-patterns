package creational.abstract_factory.impl;

import creational.abstract_factory.Burger;

public class NonVegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Non-Veg Burger");
    }
}
