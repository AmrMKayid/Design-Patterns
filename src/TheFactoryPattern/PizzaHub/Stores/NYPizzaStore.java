package TheFactoryPattern.PizzaHub.Stores;

import TheFactoryPattern.PizzaHub.*;
import TheFactoryPattern.PizzaHub.Factories.NYPizzaIngredientFactory;
import TheFactoryPattern.PizzaHub.Factories.PizzaIngredientFactory;
import TheFactoryPattern.PizzaHub.Pizzas.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
