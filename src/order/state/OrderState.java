package order.state;

import order.model.Order;

public interface OrderState {
    void handle(Order order);
}