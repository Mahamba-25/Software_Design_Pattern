package Strategy;

public class Order {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateTotal(double amount) {
        return paymentStrategy.calculateTotal(amount);
    }
}
