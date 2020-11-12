package OopHW.polymorphcar;
public class FuelCar extends Car implements Tankable {




    public FuelCar(String manuf, String model) {
        super.setManuf(manuf);
        super.setModel(model);
    }


    @Override
    public void tank(){
       // System.out.println("Fuel car was fueled with A-95");
        System.out.println(super.getManuf() + " " + super.getModel() + " was fueled with A-95");
    }

}
