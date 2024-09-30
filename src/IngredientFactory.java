// IngredientFactory.java
/**
 * Интерфейс для абстрактной фабрики ингредиентов.
 */
public interface IngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}