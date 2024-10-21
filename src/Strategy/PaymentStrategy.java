package Strategy;

/**
 * Strategy interface for payment processing.
 * Defines the method to calculate the final cost of an order.
 */
public interface PaymentStrategy {
    double calculateTotal(double amount);
}
