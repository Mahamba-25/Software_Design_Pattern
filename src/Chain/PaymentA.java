package Chain;

public class PaymentA extends PaymentHandler {

    @Override
    public void handlePayment(int amount) {
        int balance = 100;
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentA");
        } else if (next != null) {
            next.handlePayment(amount);
        }
    }
}