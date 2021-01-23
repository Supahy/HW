package ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        long startAddTime  = System.currentTimeMillis();

        LinkedList<Integer> linkedNums = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            linkedNums.add(0,i);

        }

        long stopAddTime = System.currentTimeMillis();
        System.out.println("Time to execute LinkedList is: " + (stopAddTime - startAddTime));

        long startGetTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedNums.get(i);
        }

        long stopGetTime = System.currentTimeMillis();

        System.out.println("Time to execute Get method from LinkedList is: " + (stopGetTime - startGetTime));
    }
}
