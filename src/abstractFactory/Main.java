package abstractFactory;

import abstractFactory.company.Company;
import abstractFactory.company.Msi;
import abstractFactory.product.Gpu;
import abstractFactory.product.Monitor;
import abstractFactory.product.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company msi = new Msi();
        Gpu gpu = msi.createGpu();
        Monitor monitor = msi.createMonitor();

        List.of(msi.createGpu(), msi.createMonitor())
                .forEach(Product::assemble);
    }
}
