package ArrayListLinkedList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        long startAddTime  = System.currentTimeMillis();

        ArrayList<Integer> arrayNums = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            arrayNums.add(0,i);

        }

        long stopAddTime = System.currentTimeMillis();
        System.out.println("Time to execute ArrayList is: " + (stopAddTime - startAddTime));

        long startGetTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayNums.get(i);
        }

        long stopGetTime = System.currentTimeMillis();

        System.out.println("Time to execute Get method from ArrayList is: " + (stopGetTime - startGetTime));


    }
}
