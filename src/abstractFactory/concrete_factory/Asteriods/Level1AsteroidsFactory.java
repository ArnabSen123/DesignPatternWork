package abstractFactory.concrete_factory.Asteriods;

import abstractFactory.product.Asteriods.Asteriods;
import abstractFactory.product.Asteriods.Ice_Asteroids;
import abstractFactory.product.Asteriods.Iron_Asteroids;
import abstractFactory.product.Obstacle;


public class Level1AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return (Asteriods) new Iron_Asteroids();
    }
}
