package ObjectHW.CarWithEngine;

public class Engine {
    private String name;
    private int horsepower;
    private int capacity;
    private boolean started;
    private Car car;

    public Engine(String name, int horsepower, int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
    }


    public boolean start(boolean startd) {
        if(!started){
            started = true;
            return true;
        } else {
            return false;
        }
    }

        public boolean stop(boolean stoppd) {
            if (started) {
                started = false;
                return true;
            } else {
                return false;
            }
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
