package factory.concrete_creator;

import factory.concrete_product.Ice_Asteroids;
import factory.concrete_product.Iron_Asteroids;
import factory.creator.AsteroidsFactory;
import factory.product.Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
