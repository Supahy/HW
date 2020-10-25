import java.util.Scanner;

public class TriangleApp {
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

        System.out.print("Enter your third side length: ");
        side3 = scanner.nextInt();
        System.out.println("Ok, your third size is " + side3);

        int sum1 = side1 + side2;
        int sum2 = side1 + side3;
        int sum3 = side2 + side3;


        if ((sum1 > side3) && (sum2 > side2) && (sum3 > side1)) {
            System.out.println("The triangle can be built!");
        } else {
            System.out.println("The triangle cannot be built");
        }
    }
}
