// DefaultIngredientFactory.java
/**
 * Конкретная фабрика для создания стандартных ингредиентов.
 */
public class DefaultIngredientFactory implements IngredientFactory {
    @Override
    public Milk createMilk() {
        return new Milk("Regular");
    }

    @Override
    public Syrup createSyrup() {
        return new Syrup("Vanilla");
    }
}