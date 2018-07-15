package TheFactoryPattern.PizzaHub.Stores;

import TheFactoryPattern.PizzaHub.Pizzas.Pizza;
import TheFactoryPattern.PizzaHub.PizzaType;

public class CaliforniaStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        return null;
    }
//    @Override
//    Pizza createPizza(String type) {
//        if (type.equals("cheese")) {
//            return new CaliforniaStyleCheesePizza();
//        } else if (type.equals("veggie")) {
//            return new CaliforniaStyleVeggiePizza();
//        } else if (type.equals("clam")) {
//            return new CaliforniaStyleClamPizza();
//        } else if (type.equals("pepperoni")) {
//            return new CaliforniaStylePepperoniPizza();
//        } else return null;
//    }
}
