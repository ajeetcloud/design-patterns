package creational.abstract_factory;

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
