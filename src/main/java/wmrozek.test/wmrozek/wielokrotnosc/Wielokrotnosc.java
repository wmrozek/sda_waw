package wmrozek.wielokrotnosc;

import java.util.Scanner;

public class Wielokrotnosc {
    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę: ");
        Integer number, multiplier;
        Scanner scanner = new Scanner(System.in);
        String numberInput = scanner.nextLine();
        System.out.println("Wprowadź którą wielokrotność chcesz wyświetlić: ");
        String multiplierInput = scanner.nextLine();
        try{
            number = Integer.parseInt(numberInput);
            multiplier = Integer.parseInt(multiplierInput);
        }catch(NumberFormatException e){
            System.out.println("Nie wprowadzono poprawnych danych. Program zakończy pracę");
            return;
        }

        int result = number*multiplier;
        System.out.println(String.format("%d wielokrotnością " +
                "liczby %d jest liczba %d", multiplier, number, result));
    }


}
