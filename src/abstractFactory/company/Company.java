package abstractFactory.company;

import abstractFactory.product.Gpu;
import abstractFactory.product.Monitor;

public abstract class Company {
    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
