package abstractFactory.concrete_factory.Asteriods;

import abstractFactory.product.Asteriods.Asteriods;
import abstractFactory.product.Asteriods.Rocky_Asteroids;
import abstractFactory.product.Asteriods.Silicon_Asteroids;
import abstractFactory.product.Obstacle;

public class Level2AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
