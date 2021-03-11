package RegApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

public class RegAppTest {



    @Test
    void Registration_addUser_addsUserToFile(){
        Registration.addUser("jan", 23);
        BufferedReader bf = null;
        try {
            bf =
                    new BufferedReader(new FileReader(Registration.filePath));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            String str;
            while ((str = bf.readLine()) != null)
            {
                assertThat(str).contains("jan");
                assertThat(str).contains("23");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    @Test
    void Registration_deleteUser_deletesUserFromFile(){
        Registration.addUser("jan", 24);
        Registration.addUser("Paul", 43);
        BufferedReader bf = null;
        try {
            bf =
                    new BufferedReader(new FileReader(Registration.filePath));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Registration.deleteUser("Paul");

        try {
            String str;
            while ((str = bf.readLine()) != null)
            {
                assertThat(str).isEqualTo("jan : 24");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
