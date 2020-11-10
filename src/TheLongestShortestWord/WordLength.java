package TheLongestShortestWord;

public class WordLength {
    public static void main(String[] args) {

        String longIndex = null;
        int lng = 0;
        for (int i = 0; i < args.length; i++) {
            if(args[i].length() > lng){
                lng = args[i].length();
                longIndex = args[i];
            }
        }

        System.out.println(longIndex);

        int shrt = longIndex.length();
        String shortIndex = null;

        for (int i = 0; i < args.length; i++) {
            if(args[i].length() < shrt){
                shrt = args[i].length();
                shortIndex = args[i];
            }
            if(args[i].length() == shortIndex.length()){
                System.out.print(args[i] + " ");
            }

        }
    }
}
