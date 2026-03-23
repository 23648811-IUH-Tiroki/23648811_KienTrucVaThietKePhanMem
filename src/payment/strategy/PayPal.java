package payment.strategy;

public class PayPal implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }
}