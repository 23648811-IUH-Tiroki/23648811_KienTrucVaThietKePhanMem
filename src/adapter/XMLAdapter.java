package adapter;

public class XMLAdapter implements JSONService {

    private XMLService xmlService;

    public XMLAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public void request(String jsonData) {

        // Convert JSON → XML (giả lập)
        String xmlData = convertJsonToXml(jsonData);

        System.out.println("Chuyển JSON -> XML");
        xmlService.specificRequest(xmlData);
    }

    private String convertJsonToXml(String json) {
        return "<data>" + json + "</data>";
    }
}