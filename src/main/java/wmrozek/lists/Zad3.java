package wmrozek.lists;

import java.util.ArrayList;
import java.util.List;

public class Zad3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        initialize(list);
        for (int i=2;i<list.size();i+=3){
            list.set(i, list.get(i)+list.get(i-1));
        }
        System.out.println(list);
        System.out.println("-----");
        for (int i=0;i<list.size();i++){
            if (list.get(i)%2==0){
                list.set(i, list.get(i)/2);
            }
        }
        System.out.println(list);
        System.out.println("-----");

        int sum = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(Integer elem : list){
            sum += elem;
            if (elem > max){
                max = elem;
            }

            if (elem < min){
                min = elem;
            }
        }

        System.out.println(String.format("Suma wartości: %d, Minimalna: %d, Maksymalna: %d", sum, min, max));


    }

    private static void initialize(List<Integer> list) {
        for (int i=0;i<10;i++){
            list.add(i+1);
        }
        System.out.println(list);
        System.out.println("-----");
    }
}
