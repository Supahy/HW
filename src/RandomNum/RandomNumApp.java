import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumApp {
    public static void main(String[] args) {
        int[] random = new int[10];

        for (int i = 0; i < 10; i++) {
            int num = ThreadLocalRandom.current().nextInt(0, 100);
            random[i] = num;


        }
        System.out.println(Arrays.toString(random));


    }
}
