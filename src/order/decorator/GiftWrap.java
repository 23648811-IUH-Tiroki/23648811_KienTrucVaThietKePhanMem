package order.decorator;

public class GiftWrap extends OrderDecorator {

    public GiftWrap(OrderComponent order) {
        super(order);
    }

    @Override
    public double cost() {
        return order.cost() + 10;
    }
}