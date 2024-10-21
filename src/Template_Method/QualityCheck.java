package Template_Method;

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
