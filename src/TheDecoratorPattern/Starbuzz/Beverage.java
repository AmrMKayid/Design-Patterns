package TheDecoratorPattern.Starbuzz;

public abstract class Beverage {
    String description = "Unknown Beverage";
    BeverageSize size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public BeverageSize getSize() {
        return size;
    }

    public void setSize(BeverageSize size) {
        this.size = size;
    }
}
