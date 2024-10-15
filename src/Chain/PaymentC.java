package Chain;

public class PaymentC extends PaymentHandler {

    @Override
    public void handlePayment(int amount) {
        int balance = 1000;
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentC");
        } else {
            System.out.println("Недостаточно средств для оплаты.");
        }
    }
}