package abstractFactory.concrete_factory.DebrisField;

import abstractFactory.product.DebrisField.DynamicDebrisField;
import abstractFactory.product.DebrisField.PersistentDebrisField;
import abstractFactory.product.DebrisField.StaticDebrisField;
import abstractFactory.product.Obstacle;

public class Level2DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new PersistentDebrisField();
        else return new StaticDebrisField();
    }
}
