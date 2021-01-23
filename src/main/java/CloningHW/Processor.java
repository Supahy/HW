package CloningHW;

public class Processor implements Cloneable {

    private String name;
    private double frequency;
    private int numOfCores;

    public Processor(String name, double frequency, int numOfCores){
        this.name = name;
        this.frequency = frequency;
        this.numOfCores = numOfCores;
    }

    public String getName(){
        return name;
    }

    public double getFrequency(){
        return frequency;
    }

    public int getNumOfCores(){
        return numOfCores;
    }
}
