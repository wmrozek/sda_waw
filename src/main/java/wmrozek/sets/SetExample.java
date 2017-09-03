package wmrozek.sets;

import wmrozek.model.JobPosition;
import wmrozek.model.Person;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Person person = new Person("Jan", "Kowalski", JobPosition.ANALYST);
        Person person2 = new Person("Maciej", "Nowak", JobPosition.ANALYST);
        Person person3 = new Person("Arkadiusz", "Kowalski", JobPosition.SENIOR_DEVELOPER);
        Person person4 = new Person("Michał", "Pazdan", JobPosition.TESTER);
        Person person5 = new Person("Oskar", "Pawelec", JobPosition.MANAGER);
        people.add(person);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);


        Set<Person> peopleSet = new HashSet<>();

        for (Person p : people){
            System.out.println(p);
        }
        System.out.println("======");

        peopleSet.addAll(people);
        for (Person p : peopleSet){
            System.out.println(p);
        }


    }
}
