package FindMinElement;

import java.util.Arrays;

public class MinElTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 10, -5, 0};

        System.out.println(Arrays.toString(arr));



        for (int i = 0; i <arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }


            }




        }

        System.out.println(Arrays.toString(arr));

    }
}
