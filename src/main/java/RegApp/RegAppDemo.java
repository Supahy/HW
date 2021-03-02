package RegApp;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class RegAppDemo {

    final static String filePath ="E:/users.txt";
    static HashMap<String, Integer> users = new HashMap<>();

    public static void main(String[] args) {
        addUser("tomek", 30);
        addUser("asia", 29);
        deleteUser("asia");
    }

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
