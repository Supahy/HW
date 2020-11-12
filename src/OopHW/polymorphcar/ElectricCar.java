package OopHW.polymorphcar;public class ElectricCar extends Car implements Chargable {


    public ElectricCar(String manuf, String model){
        super.setManuf(manuf);
        super.setModel(model);
    }

    @Override
    public void charge(){
        System.out.println(super.getManuf() + " " + super.getModel() + " was charged to max.");
    }
}
