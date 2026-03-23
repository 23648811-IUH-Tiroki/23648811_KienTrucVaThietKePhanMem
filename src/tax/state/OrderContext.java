package tax.state;

import tax.model.Product;

public class OrderContext {
    private State state;

    public OrderContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void process(Product product) {
        double basePrice = product.getPrice();
        double tax = state.getTaxStrategy().calculate(basePrice);

        System.out.println("Sản phẩm: " + product.getDescription());
        System.out.println("Trạng thái: " + state.getName());
        System.out.println("Giá gốc: " + basePrice);
        System.out.println("Thuế: " + tax);
        System.out.println("Tổng tiền: " + (basePrice + tax));
        System.out.println("----------------------");
    }
}