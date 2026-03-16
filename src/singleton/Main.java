package singleton;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.createOrder();
        Logger logger = Logger.getInstance();
        logger.log("System running");
    }
}