public class PaymentC extends PaymentHandler {
    private int balance = 1000;

    @Override
    public void handlePayment(int amount) {
        if (balance >= amount) {
            System.out.println("Оплата произведена через PaymentC");
        } else {
            System.out.println("Недостаточно средств для оплаты.");
        }
    }
}