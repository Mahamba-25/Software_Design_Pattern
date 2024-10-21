package Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double amount) {
        return amount + 300;
    }
}
