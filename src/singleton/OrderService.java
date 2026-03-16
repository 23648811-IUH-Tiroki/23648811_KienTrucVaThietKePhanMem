package singleton;

public class OrderService {
    public void createOrder(){
        Logger logger = Logger.getInstance();
        logger.log("Order created successfully");
    }
}