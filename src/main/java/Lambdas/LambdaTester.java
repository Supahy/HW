package Lambdas;

import java.lang.reflect.Array;
import java.util.function.Function;

public class LambdaTester {
    public static void main(String[] args) {


        String lower = "conver this to upper";


        System.out.println(modifyString("convert this to upper case", String::toUpperCase));
        System.out.println(modifyString("CONVERT THIS TO LOWER CASE", String::toLowerCase));

        String converToFirstLetter = "First letter of this";
        System.out.println(textModifier(converToFirstLetter, x -> String.valueOf(x.charAt(0))));

        String text = "Last letter of this";
        System.out.println(textModifier(text, x -> String.valueOf(x.charAt(x.length() - 1))));

        System.out.println("+++++++++++++++++++");

        String text2 = "Convert this text to its length";

        System.out.println(convertStringToInt(text2, String::length));

        String text3 = "We have to count words of this text";

        Function<String, Integer> stringToIntFunc = str->str.split(" ").length;

        System.out.println(convertStringToInt(text3, s -> text3.split(" ").length));

        int wordNum = convertStringToInt(text3, s -> s.split(" ").length);
        System.out.println("WORDNUM: " + wordNum);

        StringToIntable stringToIntable = (str, calculate) -> str.split(" ").length;

        stringToIntable.calcWordsNum(text3, s -> s.split(" ").length);




    }

    public static String modifyString(String string, Function<String, String> function){
        return function.apply(string);

    }

    public static Integer convertStringToInt(String string, Function <String, Integer> function){
        return function.apply(string);

    }

    public static String textModifier(String string, StringModifier stringModifier){
        return stringModifier.doSmth(string);
    }



    interface StringToIntable{
        int calcWordsNum(String text, Function<String, Integer> calculate);
    }

    interface StringModifier{
        String doSmth(String string);
    }
}
