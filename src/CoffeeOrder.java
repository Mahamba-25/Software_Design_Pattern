// CoffeeOrder.java
/**
 * Класс, представляющий заказ кофе.
 * Реализует паттерн Прототип для клонирования заказа.
 */
public class CoffeeOrder implements Cloneable {
    private Coffee coffee;
    private Ingredient milk;
    private Ingredient syrup;

    public CoffeeOrder(Coffee coffee, Ingredient milk, Ingredient syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    @Override
    public String toString() {
        return "Order: " + coffee + ", " + milk.getName() + ", " + syrup.getName();
    }

    @Override
    protected CoffeeOrder clone() throws CloneNotSupportedException {
        return (CoffeeOrder) super.clone();
    }
}
