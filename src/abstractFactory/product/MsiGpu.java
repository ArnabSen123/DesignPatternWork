package abstractFactory.product;

public class MsiGpu implements Gpu{
    public MsiGpu(){
        assemble();
    }
    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
