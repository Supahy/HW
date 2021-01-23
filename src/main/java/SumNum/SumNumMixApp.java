package SumNum;

public class SumNumMixApp {
    public static void main(String[] args) {
        int intSum = 0;
        double doubleSum = 0;
        boolean isDouble = false;


        for (int i = 0; i < args.length; i++) {
            if(args[i].contains(".")) {
                doubleSum = doubleSum + Double.parseDouble(args[i]);
                isDouble = true;
            } else if(!args[i].contains(".")) {
                intSum = intSum + Integer.parseInt(args[i]);
            }

        }
        if(isDouble){
            System.out.println(doubleSum);
        } else {
            System.out.println(intSum);
        }

    }
}
