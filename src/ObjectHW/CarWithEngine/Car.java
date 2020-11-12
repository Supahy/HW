package ObjectHW.CarWithEngine;

public class Car {
    private String name;
    private int tankCap;
    private double fuelRem;
    private boolean Fueled = true;
    private Engine engine;



    public Car(String name, Engine engine, int tankCap) {
        this.name = name;
        this.tankCap = tankCap;
        this.fuelRem = tankCap;
        this.engine = engine;
    }

    public void startEngine2() {
            if(engine.start(false)){
                System.out.println("Car " + name + " is starting " + engine.getName()+ " engine");
                System.out.println(name + " engine has been started");
            } else {
                System.out.println(engine.getName() + " engine has been started already in " + name);
            }
    }


 //   public void startEngine() {
 //       if (!engine.isStarted()) {
 //           engine.start();
 //           System.out.println("Car " + name + " is starting " + engine.getName() + " engine");
 //           System.out.println(engine.getName() + " engine has been started");
 //       } else {
 //           System.out.println(engine.getName() + " engine has been started already in " + name);
 //       }
 //   }

    public void stopEngine2(){
        if(engine.stop(false)){
            System.out.println("Car " + name + " is stopping " + engine.getName() + " engine");
           System.out.println(engine.getName() + " engine has been stopped");
        } else {
            System.out.println(engine.getName() + " engine has been stopped already in " + name);
        }
    }

//   public void stopEngine() {
//       if (engine.isStarted()) {
//           System.out.println("Car " + name + " is stopping " + engine.getName() + " engine");
//           System.out.println(engine.getName() + " engine has been stopped");
//       } else {
//           System.out.println(engine.getName() + " engine has been stopped already in " + name);
//       }
//   }


    public void drive(int speed, double km) {
        if (speed > engine.getHorsepower() * 2) {
            speed = engine.getHorsepower() * 2;
        }

        if ((fuelRem >= ((engine.getCapacity() / 100.0) / 100.0) * km) && (engine.isStarted()) && (Fueled)) {
            fuelRem =
                    fuelRem - ((engine.getCapacity() / 100.0) / 100.0) * km;
            System.out.printf("Car " + name + " has been driven for " + km + " km with speed " + speed + "km/h. Remaining fuel: %.1f.%n", fuelRem);
            //checking if we have enough fuel for ride
            // finding out how much fuel we need for 1 km and multiplying it for needed to drive km
            // subtracting used fuel for needed km and putting value to variable


        } else if ((fuelRem <= ((engine.getCapacity() / 100.0) / 100.0) * km) && (engine.isStarted()) && (Fueled)) {
            System.out.printf("Car " + name + " has been driven for %.1f km with speed " + speed + "km/h. Tank is empty%n", fuelRem * 5);
            fuelRem = fuelRem - fuelRem;
            Fueled = false;
            //if we need more fuel than we have we finding out how much fuel we need for 1 km and checking
            //much we can drive with that
        } else if (!engine.isStarted()) {
            System.out.println("You cant go without started engine");
        } else if (!Fueled) {
            System.out.println("You cant go without fuel");

        }
    }

    public void tank() {
        if (fuelRem != tankCap) {
            fuelRem = tankCap;
            Fueled = true;
            System.out.println("Car " + name + " has been tanked up");
        } else {
            System.out.println("Car " + name + " is already full");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFueled() {
        return Fueled;
    }

    public void setFueled(boolean fueled) {
        Fueled = fueled;
    }
}