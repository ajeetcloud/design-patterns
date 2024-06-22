package creational.abstract_factory;

import creational.abstract_factory.factory.NonVegMealFactory;
import creational.abstract_factory.factory.VegMealFactory;

public class FastFoodRestaurant {

    public static void main(String[] args) {
        MealFactory factory;

        MealFactory vegFactory = getFactory("veg");
        prepareMeal(vegFactory);

    }

    private static MealFactory getFactory(String mealType) {
        MealFactory factory;
        if (mealType.equalsIgnoreCase(("veg"))) {
            factory = new VegMealFactory();
        } else {
            factory = new NonVegMealFactory();
        }
        return factory;
    }

    public static void prepareMeal(MealFactory factory) {
        Burger burger = factory.createBurger();
        Drink drink = factory.createDrink();
        Fries fries = factory.createFries();

        burger.prepare();
        drink.pour();
        fries.pack();
    }
}
