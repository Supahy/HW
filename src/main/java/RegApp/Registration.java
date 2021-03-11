package RegApp;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Registration {

    final static String filePath = new File("").getAbsolutePath() + "/users.txt";
    static HashMap<String, Integer> users = new HashMap<>();


    public static void addUser(String name, Integer age){
        users.put(name, age);

        File file = new File(filePath);
        BufferedWriter bf = null;

        try{
            bf = new BufferedWriter(new FileWriter(file));

            for (Map.Entry<String, Integer> entry : users.entrySet()){
                bf.write(entry.getKey() + " : " + entry.getValue());
                bf.newLine();
            }
            bf.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                bf.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void deleteUser(String user){
        users.remove(user);

        File file = new File(filePath);
        BufferedWriter bf = null;

        try{
            bf = new BufferedWriter(new FileWriter(file));

            for (Map.Entry<String, Integer> entry : users.entrySet()){
                bf.write(entry.getKey() + " : " + entry.getValue());
                bf.newLine();
            }
            bf.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                bf.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
