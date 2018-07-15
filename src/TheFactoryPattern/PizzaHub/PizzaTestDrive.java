package TheFactoryPattern.PizzaHub;

import TheFactoryPattern.PizzaHub.Pizzas.Pizza;
import TheFactoryPattern.PizzaHub.Stores.ChicagoPizzaStore;
import TheFactoryPattern.PizzaHub.Stores.NYPizzaStore;
import TheFactoryPattern.PizzaHub.Stores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
