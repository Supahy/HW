package OopHW;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;


    public Person(String FirstName, String LastName, LocalDate BirthDate){
        this.firstName = FirstName;
        this.lastName = LastName;
        this.birthDate = BirthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public void goForAWalk(){
        System.out.println(firstName + " is going for a walk");
    }
}
