package payment;

import payment.strategy.*;
import payment.decorator.*;
import payment.state.*;

public class Main {
    public static void main(String[] args) {

        // Strategy
        PaymentStrategy strategy = new CreditCard();

        // Decorator
        PaymentComponent payment = new BasicPayment(strategy);
        payment = new ProcessingFee(payment);
        payment = new Discount(payment);

        // State
        PaymentContext context = new PaymentContext(new PendingState());

        System.out.println("=== THANH TOÁN ===");
        context.process();

        payment.pay(100);

        context.setState(new CompletedState());
        context.process();
    }
}