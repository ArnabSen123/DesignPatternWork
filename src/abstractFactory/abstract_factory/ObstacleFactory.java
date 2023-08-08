package abstractFactory.abstract_factory;

import abstractFactory.product.Obstacle;

public abstract class ObstacleFactory {
    public abstract Obstacle createObstacle(int score);
}
