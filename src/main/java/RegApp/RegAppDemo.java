package RegApp;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import static RegApp.Registration.*;

public class RegAppDemo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        String name;
        int age = 0;
        boolean isNumber = false;
        boolean stop = false;

        while (!stop) {
            System.out.println("Please, choose a command to commit: register or delete");
            str = scanner.nextLine();

            if (str.contains("reg")) {

                System.out.println("Please, enter the name below: ");
                name = scanner.nextLine();

                do {
                    try {
                        System.out.println("Please, enter the age: ");
                        age = scanner.nextInt();
                        isNumber = true;
                    } catch (InputMismatchException e) {
                        System.out.println("That not a nubmer!");
                        scanner.next();
                    }
                } while (!isNumber);
                addUser(name, age);
                System.out.println("Ok! registration successful!");
                System.out.println("Would you like to continue?(yes/no)");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("no")) {
                    stop = true;
                }
            } else if (str.contains("del")) {

                    System.out.println("Enter the name of person you want to delete: ");
                    name = scanner.nextLine();
                while(!users.containsKey(name)) {
                    System.out.println("Non such user exists! Please try again: ");
                    name = scanner.nextLine();
                }
                    deleteUser(name);
                    System.out.println("User has been deleted successfully");
                    System.out.println("Would you like to continue?(yes/no)");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("no")) {
                        stop = true;
                    }
            }
        }
    }
}
