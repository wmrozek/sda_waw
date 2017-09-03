package wmrozek.silnia;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(silnia(5));
    }

    public static int silnia(int number){
        if (number < 2){
            return 1;
        }
        return silnia(number-1)*number;
    }
}
