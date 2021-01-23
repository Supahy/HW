package ObjectHW.phone;

public class MobilePhone {
    private String brand;
    private String model;
    private int batCapacity;
    private int batAmount;
    private int memory;
    private int freeMemory;
    private boolean isCharged = true;



    public MobilePhone(String brand, String model, int batCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batCapacity = batCapacity;
        this.memory = memory;
        this.freeMemory = memory;
        this.batAmount = batCapacity;
    }

    public void charge(){
        if(batCapacity != batAmount || !isCharged) {
            batCapacity = batAmount;
            System.out.println(brand + " " + model + " has been charged. Remaining battery capacity: " + batCapacity + " mAh.");
            isCharged = true;
        } else {
            System.out.println("Battery is already full");
        }
    }

    public void installApp(String appName, int usedMemory){
        if (usedMemory <= freeMemory && isCharged){
            System.out.println("Application " + appName + " has been installed on " + brand + " " + model + ". Remain memory: " + (freeMemory-usedMemory));
            freeMemory = freeMemory - usedMemory;
        } else {
            System.out.println("Application " + appName + " cannot be installed on " + brand + " " + model + ". There are not enough memory or phone is discharged." );
        }
    }

    public void use(String useApp, int usedHours){
        if(batCapacity >= (usedHours*100) && isCharged){
            batCapacity = batCapacity - (usedHours*100);
            System.out.println("Application " + useApp + " has been used for " + usedHours + " hours on " + brand + " " + model + ". Remain battery capacity: " + batCapacity );
        } else if((usedHours*100) > batCapacity && isCharged) {

            System.out.println("Application " + useApp + " has been used for " + (batCapacity/100) + " hours on " + brand + " " + model + ". Phone has been discharged");
            batCapacity = batCapacity - batCapacity;

        } else {
            System.out.println("Application " + useApp + " cant be run on " + brand + " " + model + ". Phone discharged");

        }

        if (batCapacity <= 0){
            isCharged = false;
        }


    }

}
