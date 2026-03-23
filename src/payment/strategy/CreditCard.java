package payment.strategy;

public class CreditCard implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Credit Card: " + amount);
    }
}