package wmrozek.queues;

import wmrozek.model.JobPosition;
import wmrozek.model.Person;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesExample {
    public static void main(String[] args) {
        Queue<Person> people = new LinkedList<>();
        Person person = new Person("Jan", "Kowalski", JobPosition.ANALYST);
        Person person2 = new Person("Maciej", "Nowak", JobPosition.ANALYST);
        Person person3 = new Person("Arkadiusz", "Iksiński", JobPosition.SENIOR_DEVELOPER);
        Person person4 = new Person("Michał", "Pazdan", JobPosition.TESTER);
        Person person5 = new Person("Oskar", "Pawelec", JobPosition.MANAGER);
        people.offer(person);
        people.offer(person2);
        people.offer(person3);
        people.offer(person4);
        people.offer(person5);
        System.out.println(people.poll());
        System.out.println(people.poll());
        System.out.println(people.poll());
        System.out.println(people.poll());
        System.out.println(people.poll());

    }

    private static Person createPerson(String name, String surname, JobPosition position) {
        Person person = new Person(name, surname, position);
        return person;
    }
}
