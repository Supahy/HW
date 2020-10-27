package PrimeNum;

public class PrimeNumApp {
    public static void main(String[] args) {
        int a;
        int num = 2;
        int count;

        while (num <= 100) {
            count = 0;
            a = 2;
            while (a <= num / 2) {
                if (num % a == 0) {
                    count++;
                }
                a++;
            }
            if (count == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}

