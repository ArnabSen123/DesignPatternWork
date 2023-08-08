package abstractFactory;


import abstractFactory.abstract_factory.ObstacleFactory;
import abstractFactory.concrete_factory.Asteriods.Level1AsteroidsFactory;
import abstractFactory.concrete_factory.Asteriods.Level2AsteroidsFactory;
import abstractFactory.concrete_factory.BlackHole.Level1BlackHoleFactory;
import abstractFactory.concrete_factory.DebrisField.Level2DebrisFieldFactory;
import abstractFactory.product.Obstacle;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random()*2)+1;

        ObstacleFactory factory;

        if(level == 1) factory = new Level1AsteroidsFactory();
        else if(level>1 && level<2)factory = new Level2DebrisFieldFactory();
        else factory = new Level1BlackHoleFactory();
        int score = (int)(Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();




    }
}
