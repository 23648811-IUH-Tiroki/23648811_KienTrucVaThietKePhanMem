package order.model;

import order.state.*;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }

    public void cancel() {
        this.state = new CancelledState();
        state.handle(this);
    }
}