package LetterCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LetterCounter {
    public static void main(String[] args) {

        String testTest = "This is a test text";

        Map<Integer, Character> letters = new TreeMap<>();

        for (int i = 0; i < testTest.length(); i++) {
            letters.put(i, testTest.charAt(i));
        }

        System.out.println(letters.entrySet());
    }
}
