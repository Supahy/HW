package ObjectHW.CarWithEngine;

public class Engine {
    private String name;
    private int horsepower;
    private int capacity;
    private boolean isStarted;

    public Engine(String name, int horsepower, int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
    }


    public boolean isStarted() {
        return isStarted;
    }

    public String getName() {
        return name;
    }


    public void setStarted(boolean isStarted) {
        this.isStarted = isStarted;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHorsepower(){
        return horsepower;
    }
}
