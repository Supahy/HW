package OopHW;

import java.time.LocalDate;

public class Student extends Person {
    private String faculty;
    private int graduateYear;



    public Student(String Faculty, int GraduateYear, Person person){
        super(person.getFirstName(), person.getLastName(), person.getBirthDate());
        this.faculty = Faculty;
        this.graduateYear = GraduateYear;


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
        System.out.println(getFirstName() + " had 3 lessons on " + faculty + " and going for a walk");
    }
}
