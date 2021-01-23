package ImmutableCar;

import java.util.Arrays;
import java.util.List;

public class ImmutableCarDemo {
    public static void main(String[] args) {

        Wheel wheel1 = new Wheel(17, 20);
        Wheel wheel2 = new Wheel(17, 20);
        Wheel wheel3 = new Wheel(17, 20);
        Wheel wheel4 = new Wheel(17, 20);

        List<Wheel> wheels = Arrays.asList(wheel1, wheel2, wheel3, wheel4);

        Engine engine = new Engine("Gasoline", 200, 4000);

        Car car = new Car("Toyota", "Corolla", engine, wheels);
        System.out.println(car);

        engine.setHorsePower(300);
        System.out.println(engine.getHorsePower());
        System.out.println(car.getEngine().getHorsePower());
        System.out.println("+++++++++++");

        System.out.println(car.getWheels().get(0));
        System.out.println(car.getWheels().get(1));
        System.out.println("+++++++++++");
        wheel1.setRadius(100);
        wheel2.setRadius(56);
        System.out.println(car.getWheels().get(0));
        System.out.println(car.getWheels().get(1));
        System.out.println(wheel1);
        System.out.println("+++++++++++");
        System.out.println(car);
    }
}
