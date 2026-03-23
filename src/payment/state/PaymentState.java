package payment.state;

public interface PaymentState {
    void handle();
    String getName();
}
