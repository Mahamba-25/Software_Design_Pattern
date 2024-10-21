package Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double amount) {
        return amount; // No fee
    }
}
