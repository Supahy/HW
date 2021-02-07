package LetterCounter;

import java.util.*;

public class LetterCounter {
    public static void main(String[] args) {

        String testText = "This is a test text";
        System.out.println(charCounter(testText));
    }

    public static Map charCounter(String text) {

        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < text.length()-1; i++) {
            char character = text.charAt(i);
            chars.put(character, i);
        }
        return chars;
    }
}
