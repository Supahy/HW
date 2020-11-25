package Factorial;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(factorial(i));
            System.out.print(" ");

        }

    }


        public static int factorial(int num){
            if((num == 1) || (num == 0)){
                return 1;
            }
            return num*factorial(num - 1);
        }

}
