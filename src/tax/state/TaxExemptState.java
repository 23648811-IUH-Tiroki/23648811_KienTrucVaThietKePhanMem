package tax.state;

import tax.strategy.*;

public class TaxExemptState implements State {

    public TaxStrategy getTaxStrategy() {
        return new NoTaxStrategy(); // không tính thuế
    }

    public String getName() {
        return "Miễn thuế";
    }
}