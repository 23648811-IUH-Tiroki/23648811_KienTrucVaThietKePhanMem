package order.state;

import order.model.Order;

public class NewState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng");
        order.setState(new ProcessingState());
    }
}