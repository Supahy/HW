package PassVer;

import java.util.Scanner;

public class PassVer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your password: ");

        String pass1 = scanner.nextLine();
        while(pass1.length() < 8){
            System.out.print("Password should be at least 8 characters long! Try again: ");
            pass1 = scanner.nextLine();
        }
        System.out.print("Please, repeat password: ");
        String pass2 = scanner.nextLine();
        while(!pass1.equals(pass2)){
            System.out.print("Passwords should be the same! Try again: ");
            pass2 = scanner.nextLine();
        }
            System.out.print("Passwords are OK");


    }
}
