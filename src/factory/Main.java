package factory;

public class Main {
    public static void main(String[] args) {
        Restaurant chickRest = new chickenBurgerRest();
        chickRest.orderBurger();
        System.out.println("========================");

    }
}