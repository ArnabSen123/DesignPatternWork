package factory.creator;

import factory.product.Asteroids;

public abstract class AsteroidsFactory {
    public abstract Asteroids createAsteroids(int score);
}
