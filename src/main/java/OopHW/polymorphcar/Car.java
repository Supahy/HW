package OopHW.polymorphcar;public class Car {

    private String manuf;
    private String model;

   public Car(){

   }

    public Car(String manuf, String model){
        this.manuf = manuf;
        this.model = model;
    }

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
