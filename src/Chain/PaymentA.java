package Chain;

public class PaymentA extends PaymentHandler {
    private int balance = 100;

    @Override
    public void handlePayment(int amount) {
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentA");
        } else if (next != null) {
            next.handlePayment(amount);
        }
    }
}