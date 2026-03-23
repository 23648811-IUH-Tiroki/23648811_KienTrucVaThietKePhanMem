package tax.model;

public class BasicProduct implements Product {
    private String name;
    private double price;

    public BasicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return name;
    }
}