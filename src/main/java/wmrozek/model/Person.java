package wmrozek.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Person implements Serializable, Comparable<Person> {
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private JobPosition position;

    public Person(String name, String surname, JobPosition position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.position.getPriority() < o.position.getPriority()){
            return 1;
        }else if (this.position.getPriority() > o.position.getPriority()){
            return -1;
        }else{
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return position == person.position;
    }

    @Override
    public int hashCode() {
        return position != null ? position.hashCode() : 0;
    }
}


