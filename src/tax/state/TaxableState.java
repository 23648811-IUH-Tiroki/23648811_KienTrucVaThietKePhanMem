package tax.state;

import tax.strategy.*;

public class TaxableState implements State {

    public TaxStrategy getTaxStrategy() {
        return new VATStrategy();
    }

    public String getName() {
        return "Có tính thuế";
    }
}