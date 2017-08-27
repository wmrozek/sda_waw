package wmrozek.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        Book panTadeusz = new Book("Pan Tadeusz", "Gruba książka", 300, "Adam Mickiewicz");
        Book harryPotter = new Book("Harry Potter cz.1", "Jakiś opis", 300, "J.K. Rowling");
        Book inferno = new Book("Inferno", "Fajna powieść", 340, "Dan Brown");

        List<Book> books = new ArrayList<Book>();
        books.add(panTadeusz);
        books.add(harryPotter);
        books.add(inferno);


        System.out.println(books.remove(harryPotter));

        System.out.println(books);




        //integerExample();

    }

    private static void integerExample() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        Integer number = 300;
        list.add(number);
        list.add(10);
        list.add(number);
        System.out.println(list);
        list.add(0, 1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list.remove(new Integer(900)));
        System.out.println(list);
        List<Integer> negativeInteger = new ArrayList<>();
        negativeInteger.add(-3);
        negativeInteger.add(-33);
        negativeInteger.add(-32);
        System.out.println("-----");
        list.addAll(1, negativeInteger);
        System.out.println(list);
        System.out.println(list.contains(new Integer(10)));
    }
}
