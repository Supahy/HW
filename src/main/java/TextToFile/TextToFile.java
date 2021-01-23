package TextToFile;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class TextToFile {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Hello File world!");
        String fileName = "c:\\java\\hellofileworld.txt";
        File file = new File("c:\\java\\hellofileworld.txt");
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Unable to write file");
        }

        fileName = "c:\\tmp\\hellofileworld.txt";
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }

        System.out.println(lines);

    }
}
