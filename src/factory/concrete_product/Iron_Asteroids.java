package factory.concrete_product;

import factory.product.Asteroids;

public class Iron_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Iron_Asteroids popped up");
    }
}
