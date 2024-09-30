// EspressoFactory.java
/**
 * Фабрика для создания эспрессо.
 */
public class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}