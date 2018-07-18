package TheSingletonPattern.ChocOHolic;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    /*
        Improve multithreading by 3 options
     */
    private static ChocolateBoiler uniqueInstance;

    private static ChocolateBoiler uniqueInstance2 = new ChocolateBoiler();


    /*
        The volatile keyword ensures that multiple threads
        handle the uniqueInstance variable correctly
        when it is being initialized to the Singleton instance.
     */
    private volatile static ChocolateBoiler uniqueInstance3;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /**
     * if the performance of getInstance() isn’t critical to the application
     * <p>
     * A static class method to ensure that the class is SINGLETON and only have ONE Instance object
     * it's also synchronized to handle the multithreading problem
     * and force every thread to wait its turn before it can enter the method.
     *
     * @return uniqueInstance Singleton Object
     */
    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    /**
     * rely on the JVM to create the unique instance of the Singleton when the class is loaded
     *
     * @return
     */
    public static ChocolateBoiler getInstance2() {
        return uniqueInstance2;
    }

    /**
     * Use “double-checked locking” to reduce the use of synchronization in getInstance()
     *
     * @return
     */
    public static synchronized ChocolateBoiler getInstance3() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
