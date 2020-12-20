package LambdasAndStreams;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int salary;
    private Adress adress;
    private Sex sex;

    public Person(String firstName, String lastName, LocalDate birthDate, int salary, Adress adress, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
        this.adress = adress;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return salary == person.salary &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDate, person.birthDate) &&
                Objects.equals(adress, person.adress) &&
                sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, salary, adress, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                ", adress=" + adress +
                ", sex=" + sex +
                "} \n";
    }

    public static Optional<String> generateUsername(Person p) {
        String userName;
        if (p.getBirthDate() == null) {
            userName =
                    p.getFirstName().substring(0, 1).toLowerCase() + p.getLastName().toLowerCase() + Year.now();
        } else {
            userName =
                    p.getFirstName().substring(0, 1).toLowerCase() + p.getLastName().toLowerCase() + p.getBirthDate().getYear();
        }
        return Optional.of(userName);
    }
}
