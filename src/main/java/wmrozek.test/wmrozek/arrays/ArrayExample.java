package wmrozek.arrays;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] arrayInts = new Integer[10];
        arrayInts[0] = 4;
        arrayInts[5] = 100;
        for (int i=0;i<arrayInts.length;i++){
            System.out.println(arrayInts[i]);
        }
        System.out.println("-----------------");
        Integer tmp = arrayInts[0];
        arrayInts[0] = arrayInts[5];
        arrayInts[5] = tmp;
        for (int i=0;i<arrayInts.length;i++){
            System.out.println(arrayInts[i]);
        }

        for(Integer elem : arrayInts){
            System.out.println(elem);
        }

    }
}
