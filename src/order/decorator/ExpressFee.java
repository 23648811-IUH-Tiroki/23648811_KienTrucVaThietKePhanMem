package order.decorator;

public class ExpressFee extends OrderDecorator {

    public ExpressFee(OrderComponent order) {
        super(order);
    }

    @Override
    public double cost() {
        return order.cost() + 20;
    }
}