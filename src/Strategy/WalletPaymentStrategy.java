package Strategy;

/**
 * Strategy for paying by electronic wallet.
 * No commission is added to the total order amount.
 */
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double amount) {
        return amount; // No fee
    }
}
