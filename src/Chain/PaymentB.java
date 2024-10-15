package Chain;

public class PaymentB extends PaymentHandler {
    private int balance = 300;

    @Override
    public void handlePayment(int amount) {
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentB");
        } else if (next != null) {
            next.handlePayment(amount);
        }
    }
}