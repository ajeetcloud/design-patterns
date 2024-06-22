package creational.abstract_factory.factory;

import creational.abstract_factory.Burger;
import creational.abstract_factory.Drink;
import creational.abstract_factory.Fries;
import creational.abstract_factory.MealFactory;
import creational.abstract_factory.impl.Coke;
import creational.abstract_factory.impl.RegularFries;
import creational.abstract_factory.impl.VegBurger;

public class VegMealFactory implements MealFactory {

    @Override
    public Burger createBurger() {
        return new VegBurger();
    }

    @Override
    public Drink createDrink() {
        return new Coke();
    }

    @Override
    public Fries createFries() {
        return new RegularFries();
    }
}
