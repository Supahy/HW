package ObjectHW.CarWithEngine;

public class Car {
    private String name;
    private int tankCap;
    private double fuelRem;
    private boolean isFueled = true;

    Engine engine = new Engine("Diesel", 200, 2000);

    public Car(String name, Engine engine, int tankCap) {
        this.name = name;
        this.tankCap = tankCap;
        this.fuelRem = tankCap;
    }


    public void startEngine() {
        if (!engine.isStarted()) {
            engine.setStarted(true);
            System.out.println("Car " + name + " is starting " + engine.getName() + " engine");
            System.out.println(engine.getName() + " engine has been started");
        } else {
            System.out.println(engine.getName() + " engine has been started already in " + name);
        }
    }

    public void stopEngine() {
        if (engine.isStarted()) {
            engine.setStarted(false);
            System.out.println("Car " + name + " is stopping " + engine.getName() + " engine");
            System.out.println(engine.getName() + " engine has been stopped");
        } else {
            System.out.println(engine.getName() + " engine has been stopped already in " + name);
        }
    }


    public void drive(int speed, double km) {
        if (speed > engine.getHorsepower() * 2) {
            speed = engine.getHorsepower() * 2;
        }

        if ((fuelRem >= ((engine.getCapacity() / 100.0) / 100.0) * km) && (engine.isStarted()) && (isFueled)) {
            fuelRem =
                    fuelRem - ((engine.getCapacity() / 100.0) / 100.0) * km;
            System.out.printf("Car " + name + " has been driven for " + km + " km with speed " + speed + "km/h. Remaining fuel: %.1f.%n", fuelRem);
            //checking if we have enough fuel for ride
            // finding out how much fuel we need for 1 km and multiplying it for needed to drive km
            // subtracting used fuel for needed km and putting value to variable


        } else if ((fuelRem <= ((engine.getCapacity() / 100.0) / 100.0) * km) && (engine.isStarted()) && (isFueled)) {
            System.out.printf("Car " + name + " has been driven for %.1f km with speed " + speed + "km/h. Tank is empty%n", fuelRem * 5);
            fuelRem = fuelRem - fuelRem;
            isFueled = false;
            //if we need more fuel than we have we finding out how much fuel we need for 1 km and checking
            //much we can drive with that
        } else if (!engine.isStarted()) {
            System.out.println("You cant go without started engine");
        } else if (!isFueled) {
            System.out.println("You cant go without fuel");

        }
    }

    public void tank() {
        if (fuelRem != tankCap) {
            fuelRem = tankCap;
            isFueled = true;
            System.out.println("Car " + name + " has been tanked up");
        } else {
            System.out.println("Car " + name + " is already full");
        }
    }
}