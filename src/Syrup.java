// Syrup.java
/**
 * Класс, представляющий сироп.
 */
public class Syrup implements Ingredient {
    private String flavor;

    public Syrup(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getName() {
        return flavor + " Syrup";
    }
}