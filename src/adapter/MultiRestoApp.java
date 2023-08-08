

package adapter;

public class MultiRestoApp implements IMultiRestoApp {

    @Override
    public void displayJson(XmlData xmlData) {
        // Displays menus using XML data
        System.out.println("Displaying Menus using XML data...");
    }

    @Override
    public void displayProtobuff(XmlData xmlData) {
        // Displays recommendations using XML data
        System.out.println("Displaying Recommendations using XML data...");
    }

}

