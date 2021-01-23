package TheLongestShortestWord;

public class WordLength {
    public static void main(String[] args) {

        String[] longestWords = new String[5];

        String longest = null;
        int lng = 0;
        for (int i = 0; i < args.length; i++) {
            if(args[i].length() > lng){
                lng = args[i].length();
                longest = args[i];
            }
        }

        System.out.println(longest);

        int shrt = longest.length();
        String shortest = null;

        for (int i = 0; i < args.length; i++) {
            if(args[i].length() < shrt){
                shrt = args[i].length();
                shortest = args[i];
            }

        }
        System.out.println(shortest);
    }
}
