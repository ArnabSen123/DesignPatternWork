package adapter;

public class Main {
    public static void main(String[] args) {
        XmlData myData = new XmlData();

        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(myData);
        multiRestoApp.displayRecommendations(myData);

        System.out.println("==========================");

        IMultiRestoApp adapter = new FancyUIServiceAdapter();
         adapter.displayMenus(myData);
         adapter.displayRecommendations(myData);
    }
}