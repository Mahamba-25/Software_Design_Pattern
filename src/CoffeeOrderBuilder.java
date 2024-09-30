// CoffeeOrderBuilder.java
/**
 * Класс-строитель для создания заказов кофе.
 */
public class CoffeeOrderBuilder {
    private Coffee coffee;
    private Ingredient milk;
    private Ingredient syrup;

    public CoffeeOrderBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public CoffeeOrderBuilder setMilk(Ingredient milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeOrderBuilder setSyrup(Ingredient syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeOrder build() {
        return new CoffeeOrder(coffee, milk, syrup);
    }
}
