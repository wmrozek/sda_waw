package wmrozek.streams.example;

import wmrozek.streams.example.model.PersonStream;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<PersonStream> list = new ArrayList<>();
        list.add(new PersonStream("Jan", "Kowalski", 20));
        list.add(new PersonStream("Maciej", "Nowak", 34));
        list.add(new PersonStream("Jan", "Iksiński", 10));
        list.add(new PersonStream("Józef", "Glik", 30));
        list.add(new PersonStream("Marcin", "Grosicki", 24));
        Optional<PersonStream> optionalJan = list.stream()
                .filter(e -> e.getName().equals("Jan"))
                .findFirst();
        System.out.println(optionalJan.get());
        List wszyscyJanowie = list.stream()
                .filter(e->e.getName().equals("Jan"))
                .collect(Collectors.toList());
        System.out.println(wszyscyJanowie);

        List nazwiska = list.stream()
                .map(e-> e.getSurname())
                .collect(Collectors.toList());
        System.out.println(nazwiska);
        PersonStream maxAge = list.stream()
                .max(
                        (o1, o2) -> o1.getAge().compareTo(o2.getAge()))
                .get();
        PersonStream maxAge2 = list.stream()
                .max(Comparator.comparing(e->e.getAge()))
                .get();
        System.out.println(maxAge);
        System.out.println(maxAge2);


        PersonStream p1 = Stream.of(list.get(0), list.get(1),list.get(2))
                .filter(e-> e.getName().equals("Maciej") && e.getSurname().equals("Nowak"))
                .findAny().get();
        System.out.println(p1);

        PersonStream p2 = Stream.of(list.get(0),list.get(2), list.get(1))
                .filter(e-> {
                    System.out.println("Sprawdzamy obiekt "+e);
                    return e.getName().equals("Maciej") && e.getSurname().equals("Nowak");
                })
                .findAny().get();
        System.out.println(p2);

    }
}
