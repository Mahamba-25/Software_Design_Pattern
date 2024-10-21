package Strategy;


/**
 * Strategy for paying by cash on delivery.
 * Adds a flat charge of 300 rubles for delivery.
 */
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double amount) {
        return amount + 300;
    }
}
