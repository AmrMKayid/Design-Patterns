package TheFactoryPattern.PizzaHub.Stores;

import TheFactoryPattern.PizzaHub.*;
import TheFactoryPattern.PizzaHub.Factories.ChicagoPizzaIngredientFactory;
import TheFactoryPattern.PizzaHub.Factories.NYPizzaIngredientFactory;
import TheFactoryPattern.PizzaHub.Factories.PizzaIngredientFactory;
import TheFactoryPattern.PizzaHub.Pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
