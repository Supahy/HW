package FindMinElement;

import java.util.Arrays;

public class FindMinElement {
    public static void main(String[] args) {

        int min = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            if(min > number){
                min = number;
            }

        }
        System.out.println("The minimum in arguments is " + min);
    }
}
