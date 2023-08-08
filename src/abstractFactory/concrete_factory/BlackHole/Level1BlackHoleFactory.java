package abstractFactory.concrete_factory.BlackHole;

import abstractFactory.product.BlackHole.UltraWarmHole;
import abstractFactory.product.BlackHole.Warmhole;
import abstractFactory.product.DebrisField.DynamicDebrisField;
import abstractFactory.product.DebrisField.StaticDebrisField;
import abstractFactory.product.Obstacle;

public class Level1BlackHoleFactory extends BlackHoleFactory{

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 2000) return new UltraWarmHole();
        else return new Warmhole();
    }
}
