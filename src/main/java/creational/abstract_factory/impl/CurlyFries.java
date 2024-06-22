package creational.abstract_factory.impl;

import creational.abstract_factory.Fries;

public class CurlyFries implements Fries {

    @Override
    public void pack() {
        System.out.println("Adding curly fries");
    }
}
