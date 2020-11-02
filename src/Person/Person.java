package Person;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
    public String name;
    public LocalDate birthday;

    public Person(String name, LocalDate birthday){
        this.name=name;
        this.birthday=birthday;
    }
    public int compareTo(Person p){
        return this.name.compareTo(p.name);


    }
    public boolean isEquals(Person p){
        return this.birthday.isEqual(p.birthday);
    }
}
