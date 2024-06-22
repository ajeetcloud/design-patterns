package creational.abstract_factory.impl;

import creational.abstract_factory.Burger;

public class VegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }
}
