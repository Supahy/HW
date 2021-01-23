package FibSeq;

public class FibSequence {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(FibSeq(i) + " ");
        }


    }

    public static int FibSeq(int a){
        if(a < 2) {
            return a;
        }
        return FibSeq(a - 1) + FibSeq(a - 2);
    }
}

