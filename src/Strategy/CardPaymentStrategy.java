package Strategy;

/**
 * Strategy for paying by credit card.
 * Adds a 2% commission to the total order amount.
 */
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double amount) {
        return amount + (amount * 0.02); // 2% fee
    }
}