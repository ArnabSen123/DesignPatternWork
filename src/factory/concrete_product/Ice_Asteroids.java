package factory.concrete_product;

import factory.product.Asteroids;

public class Ice_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Ice_Asteroids popped up");
    }
}
