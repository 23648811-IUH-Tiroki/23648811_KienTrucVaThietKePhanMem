package order.decorator;

public class BasicOrder implements OrderComponent {
    @Override
    public double cost() {
        return 100;
    }
}