package tax.state;

import tax.strategy.TaxStrategy;

public interface State {
    TaxStrategy getTaxStrategy();
    String getName();
}