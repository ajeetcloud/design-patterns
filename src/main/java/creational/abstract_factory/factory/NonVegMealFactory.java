package creational.abstract_factory.factory;

import creational.abstract_factory.Burger;
import creational.abstract_factory.Drink;
import creational.abstract_factory.Fries;
import creational.abstract_factory.MealFactory;
import creational.abstract_factory.impl.CurlyFries;
import creational.abstract_factory.impl.NonVegBurger;
import creational.abstract_factory.impl.Pepsi;

public class NonVegMealFactory implements MealFactory {

    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }

    @Override
    public Drink createDrink() {
        return new Pepsi();
    }

    @Override
    public Fries createFries() {
        return new CurlyFries();
    }
}
