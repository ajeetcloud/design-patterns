package creational.abstract_factory;

public class NonVegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Non-Veg Burger");
    }
}
