package OopHW.polymorphcar;

public class CarTester {
    public static void main(String[] args) {

        FuelCar Opel = new FuelCar("Opel", "Vectra");
        ElectricCar Tesla = new ElectricCar("Tesla", "Model Y");
        HybridCar Toyota = new HybridCar("Toyota", "RAV4");

        Car[] cars = {Opel, Tesla, Toyota};

        for (int i = 0; i < cars.length; i++) {
            if(cars[i] instanceof HybridCar){
                ((HybridCar) cars[i]).charge();
                ((HybridCar) cars[i]).tank();
            } else if (cars[i] instanceof FuelCar){
                ((FuelCar) cars[i]).tank();
            } else if (cars[i] instanceof ElectricCar) {
                ((ElectricCar) cars[i]).charge();
            }

        }



    }
}
