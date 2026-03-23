package tax.decorator;

import tax.model.Product;

public class LuxuryDecorator extends TaxDecorator {

    public LuxuryDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 50;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + Luxury Tax";
    }
}