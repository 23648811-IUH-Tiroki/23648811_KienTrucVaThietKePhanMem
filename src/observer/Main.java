package observer;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock();

        Observer inv1 = new Investor("Alice");
        Observer inv2 = new Investor("Bob");

        stock.register(inv1);
        stock.register(inv2);

        System.out.println("=== Giá thay đổi ===");
        stock.setPrice(100);

        stock.unregister(inv2);

        System.out.println("=== Giá thay đổi lần 2 ===");
        stock.setPrice(150);
    }
}