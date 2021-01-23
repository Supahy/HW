package OopHW;

import java.time.LocalDate;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Person Jesse = new Person("Jesse", "Pinkman", LocalDate.of(1997, 8, 17));
        Person WalterWhite = new Person("Walter", "White", LocalDate.of(1972, 3, 14));
        Student JessePinkman = new Student("Psychology", 2022, Jesse);
        Student MrWhite = new Student("Chemistry", 2021, WalterWhite);
        Jesse.goForAWalk();
        JessePinkman.goForAWalk();
        WalterWhite.goForAWalk();
        MrWhite.goForAWalk();
    }
}
