// CoffeeShop.java
/**
 * Класс, представляющий кофейню.
 * Реализует паттерн Одиночка (Singleton), чтобы гарантировать, что существует только один экземпляр кофейни.
 */
public class CoffeeShop {
    private static CoffeeShop instance;

    private CoffeeShop() {
        // Приватный конструктор, чтобы предотвратить создание дополнительных экземпляров
    }

    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void takeOrder(CoffeeOrder order) {
        System.out.println("Order taken: " + order);
    }
}
