package PrimeNum;

public class PrimeNumApp2 {
    public static void main(String[] args) {

        int count = 2;
        int isPrime = 0;

        while (count <= 100){
            isPrime = 2;
            while (isPrime <= count){
                if(count == isPrime){
                    System.out.print(count + " ");
                }
                if(count % isPrime == 0){
                    break;
                }
                isPrime++;


            }


            count++;
        }

    }
}



