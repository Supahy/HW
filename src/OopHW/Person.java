package OopHW;
import java.time.LocalDate;

public class Person {
    private String FirstName;
    private String LastName;
    private LocalDate BirthDate;

    public Person(){

    }

    public Person(String FirstName, String LastName, LocalDate BirthDate){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public LocalDate getBirthDate(){
        return BirthDate;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }

    public void goForAWalk(){
        System.out.println(FirstName + " is going for a walk");
    }
}
