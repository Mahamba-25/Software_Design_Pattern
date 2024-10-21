package Template_Method;

public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Checking expiration date and ingredients...");
    }
}
