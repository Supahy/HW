import java.util.Scanner;

public class ExitCheckApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        do {
            System.out.println("Please, enter random text here or type \"exit\" to leave:");
            text = scanner.nextLine();
            System.out.println("Okay, you entered \"" + text + "\" here.");
        } while (!"exit".equalsIgnoreCase(text));
    }
}
