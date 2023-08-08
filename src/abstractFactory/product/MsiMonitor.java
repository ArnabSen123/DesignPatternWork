package abstractFactory.product;

public class MsiMonitor implements Monitor {
    public MsiMonitor(){
        assemble();
    }
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Monitor");
    }
}
