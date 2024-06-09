package creational.builder;

public interface Builder {
    void buildSauce();
    void buildToppings();
    void buildCheese();
    void buildCrust();
    Pizza getPizza();
}
