package builder;

import builder.model.Car;
import builder.model.CarBuilder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.id(2122)
                .brand("bugatti")
                .model("Chiron")
                .color("Blue");
        Car car = carBuilder.Build();
        System.out.println(car);
    }
}
