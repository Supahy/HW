package OopHW.polymorphcar;



public class HybridCar extends Car implements Tankable, Chargable{


    public HybridCar(String manuf, String model){
        super.setManuf(manuf);
        super.setModel(model);
    }

    @Override
    public void tank(){
        System.out.println(super.getManuf() + " " + super.getModel() + " hybrid has been tanked");
    }

    @Override
    public void charge(){
        System.out.println(super.getManuf() + " " + super.getModel() + " hybrid has been charged");
    }

}
