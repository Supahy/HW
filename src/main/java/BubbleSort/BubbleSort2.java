package BubbleSort;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
            int n = 0;
            boolean sorted = true;
        int[] arr = {5, 3, 11, 12, 4, 6};

        System.out.println(Arrays.toString(arr));


        do{
            sorted = true;
                for (int i = 0; i < arr.length -1; i++) {
                    if (arr[i] > arr[i + 1]){
                        sorted = false;
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i+1] = temp;

                    }
                    n++;

                }

            } while (!sorted || n == arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
}
