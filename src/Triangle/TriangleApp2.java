package Triangle;

import java.util.Scanner;

public class TriangleApp2 {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first side length: ");
        side1 = scanner.nextInt();
        System.out.println("Ok, your first size is " + side1);

        System.out.print("Enter your second side length: ");
        side2 = scanner.nextInt();
        System.out.println("Ok, your second size is " + side2);

        int sum = side1 + side2;


        System.out.print("Enter your third side length: ");
        side3 = scanner.nextInt();
        while (side3 >= sum){
            System.out.println("Triangle cannot be built! Enter smaller length: ");
            side3 = scanner.nextInt();
        }

        System.out.println("Triangle been built!");


    }
}
