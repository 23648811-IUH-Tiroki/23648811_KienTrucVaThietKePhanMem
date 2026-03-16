package factory.concreteproduct;
import factory.product.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver goods by truck on the road");
    }
}