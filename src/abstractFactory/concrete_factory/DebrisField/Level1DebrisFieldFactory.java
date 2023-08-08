package abstractFactory.concrete_factory.DebrisField;

import abstractFactory.product.Asteriods.Asteriods;
import abstractFactory.product.DebrisField.DynamicDebrisField;
import abstractFactory.product.DebrisField.StaticDebrisField;
import abstractFactory.product.Obstacle;

public class Level1DebrisFieldFactory extends DebrisFieldFactory{


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new DynamicDebrisField();
        else return new StaticDebrisField();
    }
}
