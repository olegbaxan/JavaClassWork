package Person;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday){
        this.name=name;
        this.birthday=birthday;
    }
    public int compareTo(Person p){
        //return this.name.compareTo(p.name);

        return this.birthday.compareTo(p.birthday);

    }
}
