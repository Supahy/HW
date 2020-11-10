package ObjectHW.CarWithEngine;

public class Engine {
    private String name;
    private int horsepower;
    private int capacity;
    private boolean started = false;

    public Engine(String name, int horsepower, int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
    }


    public void start() {
        if (!started) {
            started = true;
        }
    }

        public void stop(){
        started = false;
        }

    public boolean isStarted() {
        return started;
    }

    public String getName() {
        return name;
    }


    public void setStarted(boolean Started) {
        this.started = Started;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHorsepower(){
        return horsepower;
    }
}
