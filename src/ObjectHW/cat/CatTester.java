package ObjectHW.cat;

import ObjectHW.cat.Cat;

public class CatTester {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Shawn");

        cat1.eat("Fish");
        cat1.eat("Meat");
        cat1.play("ball");
        cat1.sleep(2);
        cat1.eat("Whiskas");
        cat1.eat("more Whiskas");
    }
}
