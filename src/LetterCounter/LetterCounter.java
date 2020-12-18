package LetterCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LetterCounter {
    public static void main(String[] args) {

        String testText = "This is a test text";

        Map<Integer, Character> letters = new TreeMap<>();

        for (int i = 0; i < testText.length(); i++) {
            letters.put(i, testText.charAt(i));
        }

        System.out.println(letters.entrySet());
    }
}
