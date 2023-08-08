package factory;

import factory.Burger;
import factory.chickenBurger;

public class chickenBurgerRest extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("creating chicken burger.......");
        return new chickenBurger();
    }
}
