package factory;

import factory.concrete_creator.Level1AsteroidsFactory;
import factory.concrete_creator.Level2AsteroidsFactory;
import factory.concrete_creator.Level3AsteroidsFactory;
import factory.creator.AsteroidsFactory;
import factory.product.Asteroids;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        AsteroidsFactory asteroidsFactory;

        if(level == 1) asteroidsFactory = new Level1AsteroidsFactory();
        else if(level==2) asteroidsFactory = new Level2AsteroidsFactory();
        else  asteroidsFactory = new Level3AsteroidsFactory();
        int score = (int)(Math.random() * 2000);

        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        asteroids.show();
    }
}
