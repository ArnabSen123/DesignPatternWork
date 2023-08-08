package builder;

import builder.model.Burger;
import builder.model.BurgerBuilder;

public class Main {
    public static void main(String[] args) {
        BurgerBuilder burgerBuilder = new BurgerBuilder();
        burgerBuilder.cheese(1)
                .meat(2)
                .letus(1)
                .onion(2)
                .tomato(2);
        Burger burger = burgerBuilder.Build();
        System.out.println(burger);
    }
}
