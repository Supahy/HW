package ObjectHW.cat;

public class Cat {
    private String name;
    private boolean hungry = true;


    public Cat(String name) {
        this.name = name;
    }

    public void eat(String food) {
        if(hungry) {
            System.out.println(name + " has eaten " + food + " and is not hungry anymore");
            hungry = false;
        } else {
            System.out.println(name + " is not hungry right now!");
        }
    }

    public void sleep(int hours) {
        System.out.println(name + " is slept for " + hours + " hours and is hungry");
        hungry = true;
    }

    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }

}
