package payment.state;

public class PendingState implements PaymentState {

    public void handle() {
        System.out.println("Đang chờ thanh toán...");
    }

    public String getName() {
        return "Pending";
    }
}