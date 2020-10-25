import java.util.Scanner;

public class AutopilotApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Autopilot has detected a lights, what the light?");
        System.out.println("============");
        System.out.println("Green");
        System.out.println("Yellow");
        System.out.println("Red + Yellow");
        System.out.println("Red");
        System.out.println("============");

        String lights = scanner.nextLine();

        if (lights.equalsIgnoreCase("Green")){
            System.out.println("Go!");
        } else if ((lights.equalsIgnoreCase("Yellow") || (lights.equalsIgnoreCase("Red")))) {
            System.out.println("Stop!");
        } else if (lights.equalsIgnoreCase("Red + yellow")) {
            System.out.println("Ready to go!");
        } else {
            System.out.println("No lights with such color!");
        }

    }
}
