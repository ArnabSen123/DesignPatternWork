package builder.model;

public class BurgerBuilder {

    private int cheese;
    private int meat;
    private int letus;
    private int onion;
    private int tomato;
    private int totalPrice;
    public BurgerBuilder cheese(int cheese){
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder meat(int meat) {
        this.meat = meat;
        return this;
    }

    public BurgerBuilder letus(int letus) {
        this.letus = letus;
        return this;
    }

    public BurgerBuilder onion(int onion) {
        this.onion = onion;
        return this;
    }

    public BurgerBuilder tomato(int tomato) {
        this.tomato = tomato;
        return this;
    }



    public Burger Build(){
        return new Burger(cheese, meat, letus, onion, tomato, totalPrice);
    }
}
