package TheFactoryPattern.PizzaHub.Stores;

import TheFactoryPattern.PizzaHub.Pizzas.Pizza;
import TheFactoryPattern.PizzaHub.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * The Factory Method
     * @param type: Type of the Pizza
     * @return
     */
    protected abstract Pizza createPizza(PizzaType type);
}
