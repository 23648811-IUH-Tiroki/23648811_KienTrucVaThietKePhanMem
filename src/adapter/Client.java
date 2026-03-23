package adapter;

public class Client {
    public static void main(String[] args) {
        // XML system (cũ)
        XMLService xmlService = new XMLService();

        // Adapter
        JSONService adapter = new XMLAdapter(xmlService);

        // Client chỉ dùng JSON
        adapter.request("{name:'John'}");
    }
}
