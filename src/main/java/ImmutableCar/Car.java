package ImmutableCar;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;




@EqualsAndHashCode
@ToString
public final class Car {
    private final String manufacturer;
    private final String model;
    private final Engine engine;
    private final List<Wheel> wheels;

    public Car(String manufacturer, String model, Engine engine, List<Wheel> wheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = new Engine(engine.getType(), engine.getHorsePower(), engine.getVolume());
        this.wheels = new ArrayList<>();
        for (Wheel wheel : wheels) {
            this.wheels.add(copy(wheel));
        }
    }

    private List<Wheel> copiedWheels(List<Wheel> wheelsToCopy){
        List<Wheel> copiedWheels = new ArrayList<>();
        for (Wheel wheel : wheelsToCopy){
            copiedWheels.add(new Wheel(wheel.getRadius(), wheel.getWidth()));
        }
        return copiedWheels;
    }

    public Wheel copy(Wheel wheel){
        return new Wheel(wheel.getRadius(), wheel.getWidth());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return new Engine(engine.getType(), engine.getHorsePower(), engine.getVolume());
    }

    public List<Wheel> getWheels() {
        return copiedWheels(wheels);
    }
}
