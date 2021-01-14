package com.step;

import com.step.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Person> person = new ArrayList<>();
        person.add(new Person("Sergiu", 10000.0,Gender.M, LocalDate.of(2000,01,01)));
        person.add(new Person("Maria", 8700.0,Gender.F, LocalDate.of(1970,8,10)));
        person.add(new Person("Stela", 12500.0,Gender.F, LocalDate.of(1950,6,25)));
        person.add(new Person("Petru", 2500.0,Gender.M, LocalDate.of(1999,3,19)));
        person.add(new Person("Ghenadie", 10000.0,Gender.M, LocalDate.of(2001,2,28)));
        person.add(new Person("Svetlana", 9800.0,Gender.F, LocalDate.of(2000,12,31)));

        displayMen(person);
    }
    public static void displayMen(List<Person> person){
        for (int i=0;i<person.size();i++){
            if(person.get(i).getGender().equals(Gender.valueOf("M"))){
                System.out.println("Name ="+person.get(i).getName());
            }

        }
    }
    public static void biggerSalary(){
        
    }

}
