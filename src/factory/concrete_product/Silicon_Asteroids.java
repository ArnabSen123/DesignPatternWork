package factory.concrete_product;

import factory.product.Asteroids;

public class Silicon_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Silicon_Asteroids popped up");
    }
}
