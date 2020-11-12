package ObjectHW.CarWithEngine;

public class CarWithEngineTester {
    public static void main(String[] args) {
        Engine Diesel = new Engine("Diesel", 200, 2000);
        Car Toyota = new Car("Toyota Camry", Diesel, 50);
        Toyota.startEngine2();
        Toyota.startEngine2();
        Toyota.stopEngine2();
        Toyota.stopEngine2();
        Toyota.startEngine2();
        Toyota.drive(100, 32.6);
        Toyota.drive(70, 45.3);
        Toyota.drive(600, 122);
        Toyota.drive(130, 72.6);
        Toyota.drive(60, 300);
        Toyota.tank();
        Toyota.drive(140, 60);

    }
}
