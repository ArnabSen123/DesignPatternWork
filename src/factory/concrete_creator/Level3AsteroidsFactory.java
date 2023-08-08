package factory.concrete_creator;

import factory.concrete_product.Diamond_Asteroids;
import factory.concrete_product.Gold_Asteroids;
import factory.concrete_product.Lengendary_Asteroid;
import factory.creator.AsteroidsFactory;
import factory.product.Asteroids;


public class Level3AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 1500){
            return (Asteroids) new Diamond_Asteroids();
        }
        else if(score> 2000 && score <3000){
            return  new Gold_Asteroids();
        }
        else return new Lengendary_Asteroid();
    }
}
