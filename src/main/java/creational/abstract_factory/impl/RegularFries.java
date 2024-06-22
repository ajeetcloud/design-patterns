package creational.abstract_factory.impl;

import creational.abstract_factory.Fries;

public class RegularFries implements Fries {

    @Override
    public void pack() {
        System.out.println("Adding regular fries");
    }
}
