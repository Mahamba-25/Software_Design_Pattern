// Main.java
/**
 * Основной класс приложения для демонстрации работы кофейни.
 */
public class Main {
    public static void main(String[] args) {
        // Singleton: Получаем единственный экземпляр кофейни
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Factory Method: Создаем фабрику для эспрессо и производим кофе
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();

        // Abstract Factory: Создаем фабрику для ингредиентов и получаем молоко и сироп
        IngredientFactory ingredientFactory = new DefaultIngredientFactory();
        Ingredient milk = ingredientFactory.createMilk();
        Ingredient syrup = ingredientFactory.createSyrup();

        // Builder: Строим заказ кофе с выбранными ингредиентами
        CoffeeOrderBuilder builder = new CoffeeOrderBuilder();
        CoffeeOrder order = builder.setCoffee(espresso)
                .setMilk(milk)
                .setSyrup(syrup)
                .build();

        // Prototype: Клонируем заказ для повторного использования
        try {
            CoffeeOrder orderClone = order.clone();
            coffeeShop.takeOrder(order);
            coffeeShop.takeOrder(orderClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
