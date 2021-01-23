package UniqueLetters;

import java.util.*;

public class UniqueLetters {
    public static void main(String[] args) {

        String testText = "This is a test text";


        LinkedHashSet<Character> letters = new LinkedHashSet<>();

        for (int i = 0; i < testText.length(); i++)
            if(testText.charAt(i) == ' ') {
                continue;
            } else {
            letters.add(testText.charAt(i));
        }
        System.out.println(letters);
    }
}
