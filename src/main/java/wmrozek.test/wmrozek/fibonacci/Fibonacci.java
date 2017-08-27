package wmrozek.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Ile liczb chcesz wyświetlić?");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        int elementsCount;
        try{
            elementsCount = Integer.parseInt(userChoice);
        }catch(NumberFormatException e){
            System.out.println("Nieprawidłowa liczba. Zamiast tego zostanie wyświetlonych 20 elementów ciągu");
            elementsCount = 20;
        }

        int result = recurent(elementsCount);
        System.out.println(result);
//        iteration(elementsCount);






    }


    private static int recurent(int elem){
        if (elem == 1 || elem == 2){
            return 1;
        }
        return recurent(elem-1)+ recurent(elem-2);
    }

    private static void iteration(int elementsCount) {
        long n1 =1, n2 =1;

        for (int i=0; i< elementsCount; i++){
            if (i<2){
                System.out.println(String.format("%d -ty element: %d", i+1, 1));
                continue;
            }
            n1 = n1+n2;
            n2 = n1-n2;
            System.out.println(String.format("%d -ty element: %d", i+1, n1));
        }
    }
}
