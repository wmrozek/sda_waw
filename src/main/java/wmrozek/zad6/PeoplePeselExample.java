package wmrozek.zad6;

import java.util.HashMap;
import java.util.Map;

public class PeoplePeselExample {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Kowalski", "89032412345");
        Person p2 = new Person("Marcin", "Nowak", "89232412345");
        Person p3 = new Person("Lukasz", "Fabiański", "12232412345");
        Person p4 = new Person("Kamil", "Glik", "69032412345");
        Person p5 = new Person("Jakub", "Wawrzyniak", "55112412345");
        Person p6 = new Person("Artur", "Jędrzejczyk", "16232412345");
        Person p7 = new Person("Piotr", "Zieliński", "00242512345");
        Person p8 = new Person("Kamil", "Grosicki", "88072412345");
        Person p9 = new Person("Grzegorz", "Krychowiak", "78122412345");
        Map<String, Person> map = new HashMap();
        map.put(p1.getPesel(), p1);
        map.put(p2.getPesel(), p2);
        map.put(p3.getPesel(), p3);
        map.put(p4.getPesel(), p4);
        map.put(p5.getPesel(), p5);
        map.put(p6.getPesel(), p6);
        map.put(p7.getPesel(), p7);
        map.put(p8.getPesel(), p8);
        map.put(p9.getPesel(), p9);

        for (Map.Entry<String, Person> entry: map.entrySet()){
            System.out.println(String.format(
                    "Pesel: %s, osoba: %s %s",
                    entry.getKey(),
                    entry.getValue().getName(),
                    entry.getValue().getSurname()));
        }
        System.out.println("-------------------------");
        System.out.println("Osoby starsze niż 25 lat");
        for(String pesel : map.keySet()){
            String yearFromPesel = pesel.substring(0,2);
            int year = Integer.parseInt(yearFromPesel);
            if (pesel.charAt(2) == '2'
                    || pesel.charAt(2) == '3'){
                year += 2000;
            }else{
                year += 1900;
            }
            if (2017 - year > 25){
                Person p = map.get(pesel);
                System.out.println(String.format(
                        "Pesel: %s, osoba: %s %s",
                        p.getPesel(),
                        p.getName(),
                        p.getSurname()));
            }
        }
        System.out.println("----------------------");
        System.out.println("Osoby o nazwisku Kowalski i Nowak");
        for (Person p : map.values()){
            if (p.getSurname().equals("Kowalski") || p.getSurname().equals("Nowak")){
                System.out.println(String.format(
                        "Pesel: %s, osoba: %s %s",
                        p.getPesel(),
                        p.getName(),
                        p.getSurname()));
            }
        }
    }
}
