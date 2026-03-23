package tax.strategy;

public class LuxuryStrategy implements TaxStrategy {
    public double calculate(double price) {
        return price * 0.2;
    }
}