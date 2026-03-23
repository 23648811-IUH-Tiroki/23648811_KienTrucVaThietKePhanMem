package order.state;

import order.model.Order;

public class CancelledState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Hủy đơn và hoàn tiền");
    }
}