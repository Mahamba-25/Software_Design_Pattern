package Template_Method;

/**
 * Abstract class for the template method pattern.
 * Defines the template method for quality checking with steps that can vary in subclasses.
 */
public abstract class QualityCheck {
    public final void performCheck() {
        checkAppearance();
        checkSpecificCharacteristics();
        generateReport();
    }

    protected void checkAppearance() {
        System.out.println("Checking appearance...");
    }

    protected abstract void checkSpecificCharacteristics();

    protected void generateReport() {
        System.out.println("Generating report...");
    }
}
