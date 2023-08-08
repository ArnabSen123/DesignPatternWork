package factory;

import factory.Burger;

public abstract class Restaurant {
    public void orderBurger(){
        System.out.println("Ordering burger..........");
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
}
