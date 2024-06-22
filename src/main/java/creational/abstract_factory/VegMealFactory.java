package creational.abstract_factory;

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
