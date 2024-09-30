// Milk.java
/**
 * Класс, представляющий молоко.
 */
public class Milk implements Ingredient {
    private String type;

    public Milk(String type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return type + " Milk";
    }
}