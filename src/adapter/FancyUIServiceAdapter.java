 package adapter;

public class FancyUIServiceAdapter implements IMultiRestoApp {

    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();
    }

    @Override
    public void displayJson(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Menus using converted JSON data...");
        fancyUIService.displayJson(jsonData);
    }

    @Override
    public void displayProtobuff(XmlData xmlData) {
        Protobuff protobuff = convertXmlToProtobuff(xmlData);
        System.out.println("Displaying Fancy Recommendations using converted Protobuff data...");
        fancyUIService.displayProtobuff(protobuff);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        // Converts XmlData to JsonData and return it
        System.out.println("Converting XML to JSON...");
        return new JsonData();
    }
    private Protobuff convertXmlToProtobuff(XmlData xmlData) {
        // Converts XmlData to protobuff and return it
        System.out.println("Converting XML to Protobuff...");
        return new Protobuff();
    }
}

