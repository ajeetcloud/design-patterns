package creational.abstract_factory;

public class VegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }
}
