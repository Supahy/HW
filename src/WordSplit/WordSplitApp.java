public class WordSplitApp {
    public static void main(String[] args) {


        String txt = args[0];

        char[] arr = txt.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}