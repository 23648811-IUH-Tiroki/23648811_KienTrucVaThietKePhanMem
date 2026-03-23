package payment.decorator;

public class Discount extends PaymentDecorator {

    public Discount(PaymentComponent component) {
        super(component);
    }

    public void pay(double amount) {
        double newAmount = amount * 0.9;
        System.out.println("Áp dụng giảm giá 10%");
        component.pay(newAmount);
    }
}