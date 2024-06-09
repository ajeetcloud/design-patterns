package creational.builder;

public class BuildMePizza {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        PizzaDirector director = new PizzaDirector(pizzaBuilder);
        director.constructPizza();
        Pizza pizza = director.getPizza();


        PizzaBuilder myPizzaBuilder = new PizzaBuilder();
        myPizzaBuilder.buildCrust();
        myPizzaBuilder.buildSauce();
        myPizzaBuilder.buildCheese();
        //myPizzaBuilder.buildToppings();

        Pizza myPizza = myPizzaBuilder.getPizza();
        System.out.println(myPizza);

    }
}
