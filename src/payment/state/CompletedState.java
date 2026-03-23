package payment.state;

public class CompletedState implements PaymentState {

    public void handle() {
        System.out.println("Thanh toán thành công!");
    }

    public String getName() {
        return "Completed";
    }
}