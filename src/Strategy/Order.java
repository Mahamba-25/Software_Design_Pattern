package Strategy;

/**
 * Represents a customer's order.
 * The final cost of the order is calculated using the selected payment strategy.
 */
public class Order {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateTotal(double amount) {
        return paymentStrategy.calculateTotal(amount);
    }
}
