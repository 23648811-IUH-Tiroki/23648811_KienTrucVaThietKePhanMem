package payment.decorator;

public class ProcessingFee extends PaymentDecorator {

    public ProcessingFee(PaymentComponent component) {
        super(component);
    }

    public void pay(double amount) {
        double newAmount = amount + 10;
        System.out.println("Thêm phí xử lý: +10");
        component.pay(newAmount);
    }
}