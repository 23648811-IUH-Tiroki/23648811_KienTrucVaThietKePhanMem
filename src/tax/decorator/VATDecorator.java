package tax.decorator;

import tax.model.Product;

public class VATDecorator extends TaxDecorator {

    public VATDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 1.1;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + VAT";
    }
}