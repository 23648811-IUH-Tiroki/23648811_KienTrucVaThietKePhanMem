package payment.state;

public class PaymentContext {
    private PaymentState state;

    public PaymentContext(PaymentState state) {
        this.state = state;
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void process() {
        System.out.println("Trạng thái: " + state.getName());
        state.handle();
    }
}