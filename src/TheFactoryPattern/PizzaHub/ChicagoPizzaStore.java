package TheFactoryPattern.PizzaHub;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case VEGGIE:
                return new ChicagoStyleVeggiePizza();
            case CLAM:
                return new ChicagoStyleClamPizza();
            case PEPPERONI:
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
