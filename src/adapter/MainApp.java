
package adapter;

public class MainApp {


    public static void main(String[] args) {

        XmlData myData = new XmlData();

        IMultiRestoApp adapter1 = new FancyUIServiceAdapter();
        adapter1.displayJson(myData);
        adapter1.displayProtobuff(myData);
        
    }

}
