package CloningHW;

import PrimeNum.PrimeNumApp;

public class Laptop implements Cloneable {
    private String name;
    private Processor processor;
    private HardDrive hardDrive;
    private int displaySize;
    private int weight;
    private int ram;

    public Laptop(String name, Processor processor, HardDrive hardDrive, int displaySize, int weight, int ram) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.weight = weight;
        this.ram = ram;
    }

@Override
    public Laptop clone() throws CloneNotSupportedException {
        Laptop cloned = (Laptop) super.clone();
        cloned.setHardDrive(hardDrive);
        cloned.setProcessor(processor);
        return cloned;

    }

    public static Laptop copyLaptop(Laptop laptop){
        Laptop copyLaptop = new Laptop(laptop.name, laptop.processor, laptop.hardDrive, laptop.displaySize, laptop.weight, laptop.ram);
        HardDrive copyDrive = new HardDrive(laptop.hardDrive.getName(), laptop.hardDrive.getType(), laptop.hardDrive.getCapacity());
        Processor copyProcessor = new Processor(laptop.processor.getName(), laptop.processor.getFrequency(), laptop.processor.getNumOfCores());
        return copyLaptop;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
