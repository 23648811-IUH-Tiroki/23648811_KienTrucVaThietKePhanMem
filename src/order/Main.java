package order;

import order.model.Order;
import order.strategy.*;
import order.decorator.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== STATE PATTERN ===");
        Order order = new Order();
        order.process(); // New -> Processing
        order.process(); // Processing -> Delivered

        System.out.println("\n=== STRATEGY PATTERN ===");
        ShippingStrategy shipping = new ExpressShipping();
        shipping.ship();

        System.out.println("\n=== DECORATOR PATTERN ===");
        OrderComponent orderCost = new BasicOrder();
        orderCost = new GiftWrap(orderCost);
        orderCost = new ExpressFee(orderCost);

        System.out.println("Total cost: " + orderCost.cost());
    }
}