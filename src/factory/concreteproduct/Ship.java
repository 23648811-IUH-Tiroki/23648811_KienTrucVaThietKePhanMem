package factory.concreteproduct;
import factory.product.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver goods by ship on the sea");
    }
}