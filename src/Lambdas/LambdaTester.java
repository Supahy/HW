package Lambdas;

import java.lang.reflect.Array;
import java.util.function.Function;

public class LambdaTester {
    public static void main(String[] args) {


        String lower = "conver this to upper";


        System.out.println(modifyString("convert this to upper case", String::toUpperCase));
        System.out.println(modifyString("CONVERT THIS TO LOWER CASE", String::toLowerCase));
        System.out.println(modifyString("First letter of this", String::new).substring(0, 1));

        String text = "Last letter of this";
        System.out.println(modifyString(text, String::toString).substring(text.length() -1, text.length()));

        System.out.println("+++++++++++++++++++=");

        String text2 = "Convert this text to its length";

        System.out.println(convertStringToInt(text2, String::length));

        String text3 = "We have to count words of this text";
        String splitted;

        //System.out.println(convertStringToInt(text3, String.valueOf(text3.split(" ")) :: length));

        //convertStringToInt(text3, Array.getLength(String.valueOf(text3.split(" "))) ->

        //System.out.println(convertStringToInt(String.valueOf(text3.split(" ")), ));

    }

    public static String modifyString(String string, Function<String, String> function){
        return function.apply(string);

    }

    public static Integer convertStringToInt(String string, Function<String, Integer> function){
        return function.apply(string);

    }
}
