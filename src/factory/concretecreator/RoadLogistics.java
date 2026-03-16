package factory.concretecreator;

import factory.creator.Logistics;
import factory.product.Transport;
import factory.concreteproduct.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}