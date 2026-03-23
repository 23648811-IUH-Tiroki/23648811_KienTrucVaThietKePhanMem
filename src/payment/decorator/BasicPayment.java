package payment.decorator;

import payment.strategy.PaymentStrategy;

public class BasicPayment implements PaymentComponent {
    private PaymentStrategy strategy;

    public BasicPayment(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        strategy.pay(amount);
    }
}