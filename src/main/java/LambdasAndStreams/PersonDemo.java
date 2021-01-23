package LambdasAndStreams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {
        Adress Krakow = new Adress("Krakow");
        Adress Warszawa = new Adress("Warszawa");
        Adress Legnica = new Adress("Legnica");
        Adress Bielsko = new Adress("Bielsko-Biala");


        Person Magda =
                new Person("Magdalena", "Morska", LocalDate.of(1997, 9, 18), 3800, Legnica, Sex.FEMALE);
        Person Martyna =
                new Person("Martyna", "Wiezik", LocalDate.of(2001, 9, 26), 10500, Bielsko, Sex.FEMALE);
        Person Bartek =
                new Person("Bartosz", "Lisc", LocalDate.of(1992, 6, 30), 1200, Krakow, Sex.MALE);
        Person Krystian =
                new Person("Krystian", "Dubacki", LocalDate.of(1989, 2, 21), 3500, Krakow, Sex.MALE);
        Person Taylor =
                new Person("Taylor", "Goldberg", LocalDate.of(1996, 3, 17), 6000, Krakow, Sex.OTHER);
        Person April =
                new Person("April", "Ashley", LocalDate.of(1935, 4, 29), 4500, Warszawa, Sex.HELICOPTER);
        Person Wojtek =
                new Person("Wojtek", "Schafter", LocalDate.of(1998, 8, 11), 20000, Warszawa, Sex.MALE);
        Person Renata =
                new Person("Renata", "Gondek", LocalDate.of(1974, 9, 6), 5000, Bielsko, Sex.FEMALE);
        Person Gabriel =
                new Person("Gabriel", "Kubacki", LocalDate.of(2003, 5, 18), 2800, Krakow, Sex.MALE);
        Person Andzelika =
                new Person("Andzelika", "Lombard", LocalDate.of(1995, 11, 24), 4500, Legnica, Sex.FEMALE);

        List<Person> persons =
                List.of(Magda, Martyna, Bartek, Krystian, Taylor, April, Wojtek, Renata, Gabriel, Andzelika);

        List<Person> menUnder65 = persons.stream()
                .filter(person -> person.getBirthDate().isAfter(LocalDate.now().minus(65, ChronoUnit.YEARS)))
                .filter(person -> person.getSex().equals(Sex.MALE))
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());


        List<Person> womenWithSalaryLessThan5000 =
                persons.stream()
                        .filter(person -> person.getSex().equals(Sex.FEMALE))
                        .filter(person -> person.getSalary() < 5000)
                        .sorted(Comparator.comparing(Person::getBirthDate))
                        .collect(Collectors.toList());


        List<Person> krakowKids = persons.stream()
                .filter(person -> person.getBirthDate().isAfter(LocalDate.now().minus(18, ChronoUnit.YEARS)))
                .filter(person -> person.getAdress().equals(Krakow))
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());


        List<Person> notFromKrk = persons.stream()
                .filter(person -> !person.getAdress().equals(Krakow))
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());

        String averageSalary = persons.stream()
                .mapToInt(Person::getSalary).average()
                .toString();

        long numberOfWomenInKrk = persons.stream()
                .filter(person -> person.getAdress().equals(Krakow))
                .count();

        long numberOfMenAbove65 = persons.stream()
                .filter(person -> person.getSex().equals(Sex.MALE))
                .filter(person -> person.getBirthDate().isBefore(LocalDate.now().minus(65, ChronoUnit.YEARS)))
                .count();

        String theOldestPerson = persons.stream()
                .reduce((person, person2) -> person.getBirthDate().isBefore(person2.getBirthDate()) ? person : person2)
                .toString();

        String youngestFromKrk = persons.stream()
                .filter(person -> person.getAdress().equals(Krakow))
                .reduce((person, person2) -> person.getBirthDate().isAfter(person2.getBirthDate()) ? person : person2)
                .toString();

        Integer totalSalary = persons.stream()
                .mapToInt(Person::getSalary).sum();


        boolean anyHasFirstLetterA = notFromKrk.stream()
                .anyMatch(person -> person.getFirstName().startsWith("A"));

        boolean allLastNamesContainA = notFromKrk.stream()
                .allMatch(person -> person.getLastName().contains("a"));

        String martynaUserName = Person.generateUsername(Martyna);

        System.out.println(martynaUserName);











    }
}
