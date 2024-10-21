package Template_Method;

/**
 * Quality check for electronics.
 * Implements the check for specific characteristics of electronic devices.
 */
public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Checking functionality and warranty...");
    }
}
