package wmrozek.maps;

import wmrozek.model.JobPosition;
import wmrozek.model.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", JobPosition.ANALYST);
        Person person2 = new Person("Maciej", "Nowak", JobPosition.ANALYST);
        Person person3 = new Person("Arkadiusz", "Kowalski", JobPosition.SENIOR_DEVELOPER);
        Person person4 = new Person("Jan", "Pazdan", JobPosition.TESTER);
        Person person5 = new Person("Oskar", "Pawelec", JobPosition.MANAGER);

        Map<String, Person> map = new HashMap<>();
        map.put("1", person);
        map.put("2", person2);
        map.put("3", person3);
        map.put("2", person4);
        map.put("5", person5);

        for(Map.Entry<String, Person> entry : map.entrySet()){
            System.out.println(String.format
                    ("Klucz %s, wartość %s", entry.getKey(),
                            entry.getValue().toString()));
        }

        System.out.println("Klucze ===============");
        for (String key : map.keySet()){
            System.out.println(String.format(
                    "Klucz %s, wartość %s", key,
                    map.get(key).toString()));
        }
        System.out.println("Wartości =========");
        for (Person p : map.values()){
            System.out.println(String.format(
                    "Wartość %s",
                    p.toString()));
        }

        Person p = map.get("2");
        boolean ifExists = map.containsKey("Klucz przykładowy");
        boolean valueExists = map.containsValue(person2);
        Person defaultPerson = map.getOrDefault("2", new Person("Człowiek", "Widmo", JobPosition.MANAGER));
        System.out.println(defaultPerson);

    }

}
