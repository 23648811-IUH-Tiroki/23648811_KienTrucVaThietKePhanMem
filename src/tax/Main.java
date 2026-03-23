package tax;

import tax.model.*;
import tax.decorator.*;
import tax.state.*;

public class Main {
    public static void main(String[] args) {

        // 1. Sản phẩm gốc
        Product product = new BasicProduct("Laptop", 1000);

        // 2. Decorator (cộng phí trước)
        product = new VATDecorator(product);
        product = new LuxuryDecorator(product);

        // 3. State (quyết định có tính thuế không)
        OrderContext order = new OrderContext(new TaxableState());

        System.out.println("=== TRƯỜNG HỢP CÓ THUẾ ===");
        order.process(product);

        System.out.println("=== TRƯỜNG HỢP MIỄN THUẾ ===");
        order.setState(new TaxExemptState());
        order.process(product);
    }
}