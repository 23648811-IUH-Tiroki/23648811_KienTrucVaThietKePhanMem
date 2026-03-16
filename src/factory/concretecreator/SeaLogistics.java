package factory.concretecreator;

import factory.creator.Logistics;
import factory.product.Transport;
import factory.concreteproduct.Ship;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}