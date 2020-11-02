import Person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person= new ArrayList<>();


        person.add(new Person("Ion", LocalDate.of(2000,01,06)));
        person.add(new Person("Sergiu", LocalDate.of(1999,11,06)));
        person.add(new Person("Petru", LocalDate.of(1996,01,06)));
        person.add(new Person("Dumitru", LocalDate.of(2000,01,06)));
        person.add(new Person("Doina", LocalDate.of(2000,11,06)));

        Collections.sort(person);
    }
}
