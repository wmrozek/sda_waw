package wmrozek.parzystosc;

import java.util.Scanner;

public class ParzystaExample {
    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę: ");
        Integer number;
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        try{
            number = Integer.parseInt(userChoice);
        }catch(NumberFormatException e){
            System.out.println("Nie wprowadzono liczby. Program zakończy pracę");
            return;
        }
        //userChoice = "Wartość zmodyfikowana w kodzie";
        double numberDouble = 2.0;
        if (number%2 == 0){
            System.out.println(String.format(
                    "Wprowadzona liczba %f jest parzysta. " +
                            "Wartość podana przez " +
                            "użytkownika: %s", numberDouble, userChoice));
        }else{
            System.out.println("Wprowadzona liczba jest nieparzysta");
        }


    }
}
