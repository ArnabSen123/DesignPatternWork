package factory;

import factory.Burger;

public class chickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("preparing chicken burger");
    }
}
