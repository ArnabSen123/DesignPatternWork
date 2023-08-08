package builder.model;

public class Burger {
    private final int cheese;
    private final int meat;
    private final int letus;
    private final int onion;
    private final int tomato;

    private final int totalPrice;


    Burger(int cheese, int meat, int letus, int onion, int tomato, int totalPrice){
        this.cheese = cheese;
        this.meat = meat;
        this.letus = letus;
        this.onion = onion;
        this.tomato = tomato;
        this.totalPrice = (getCheese()*cheese)+(getMeat()*meat)+(getLetus()*letus)+(getOnion()*onion)+(getTomato()*tomato);
    }

    public int getCheese(){
        return 5;
    }

    public int getMeat() {
        return 10;
    }

    public int getLetus() {
        return 3;
    }

    public int getOnion() {
        return 2;
    }

    public int getTomato() {
        return 4;
    }

    @Override
    public String toString() {
        return """
                Burger {
                    cheese=%d,
                    meat=%d,
                    letus=%d,
                    onion=%d,
                    tomato=%d,
                    totalPrice=%d
                }""".formatted(cheese, meat, letus, onion, tomato, totalPrice);
    }
}
