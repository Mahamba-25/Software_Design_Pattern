package Chain;

public class PaymentB extends PaymentHandler {

    @Override
    public void handlePayment(int amount) {
        int balance = 300;
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentB");
        } else if (next != null) {
            next.handlePayment(amount);
        }
    }
}