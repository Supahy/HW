package DiscountCalc;

import java.util.Scanner;

public class DiscountCalcApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int providedPrice;
        int age;
        double disc;
        double actualPrice;


        System.out.print("Please, provide item price: ");
        providedPrice = sc.nextInt();

        System.out.print("Please, input customer age: ");
        age = sc.nextInt();

        if (age <= 6){
            disc = (providedPrice*0.80);
            actualPrice = providedPrice - disc;
            System.out.printf("Discounted price is: %.2f ", actualPrice);
        } else if ((age > 6) && (age <=18)) {
            disc = (providedPrice*0.25);
            actualPrice = providedPrice - disc;
            System.out.printf("Discounted price is: %.2f", actualPrice);
        } else if (age > 65) {
            disc = (providedPrice*0.30);
            actualPrice = providedPrice - disc;
            System.out.printf("Discounted price is: %.2", actualPrice);
        } else {
            actualPrice = providedPrice;
            System.out.printf("You have no discount. Your price is: %.2f", actualPrice);
        }

    }
}
