package creational.builder;

public class PizzaDirector {
    private Builder builder;

    public PizzaDirector(Builder builder) {
        this.builder = builder;
    }

    public void constructPizza() {
        builder.buildCrust();
        builder.buildSauce();
        builder.buildToppings();
        builder.buildCheese();
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }

}
