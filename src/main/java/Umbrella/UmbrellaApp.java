package Umbrella;

import java.util.Scanner;

public class UmbrellaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is it raining now?");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("yes")) {
            System.out.println("Do not forget umbrella!");
        }
            if (answer1.equalsIgnoreCase("no")) {
                System.out.println("Leave umbrella at home.");

            }
        }
    }
