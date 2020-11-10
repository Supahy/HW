package OopHW;

import java.time.LocalDate;

public class Student extends Person {
    private String faculty;
    private int graduateYear;
    private Person person;



    public Student(String Faculty, int GraduateYear, Person person){
        super();
        this.faculty = Faculty;
        this.graduateYear = GraduateYear;
        this.person = person;


    }


    public String getFaculty(){
        return faculty;
    }

    public int getGraduateYear(){
        return graduateYear;
    }

    public void setFaculty(String Faculty){
        faculty = faculty;
    }

    public void setGraduateYear(int GraduateYear){
        graduateYear = GraduateYear;
    }

    @Override
    public void goForAWalk(){
        System.out.println(person.getFirstName() + " had 3 lessons on " + faculty + " and going for a walk");
    }
}
