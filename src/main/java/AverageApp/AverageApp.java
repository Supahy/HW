package AverageApp;

public class AverageApp {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Double.parseDouble(args[i]);


        }
        System.out.println("The average value is " + sum/ args.length);
    }
}
