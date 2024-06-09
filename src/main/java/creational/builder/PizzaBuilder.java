package creational.builder;

public class PizzaBuilder implements Builder{

    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Tomato, Basil");
    }

    @Override
    public void buildCheese() {
        pizza.setCheese("Mozzarella Cheese");
    }

    @Override
    public void buildCrust() {
        pizza.setCrust("Thin Crust");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
