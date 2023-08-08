package abstractFactory.company;

import abstractFactory.product.Gpu;
import abstractFactory.product.Monitor;
import abstractFactory.product.MsiGpu;
import abstractFactory.product.MsiMonitor;

public class Msi extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
