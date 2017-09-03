package wmrozek.arrays;

public class Zad2 {
    public static void main(String[] args) {
        int[] arrayInts = new int[10];
        initializeArrayAndDisplay(arrayInts);
        addValueAndDisplay(arrayInts);
        divideValueAndDisplay(arrayInts);
        sumElementsAndDisplay(arrayInts);
    }

    private static void sumElementsAndDisplay(int[] arrayInts) {
        int sum = 0;
        for (int i=0; i<arrayInts.length;i++){
            sum+=arrayInts[i];
        }
        System.out.println("suma: "+sum);
    }

    private static void divideValueAndDisplay(int[] arrayInts) {
        for(int i=0;i<arrayInts.length;i++){
            if (arrayInts[i]%2 == 0){
                arrayInts[i] = arrayInts[i]/2;
            }
        }
        printArray(arrayInts);
    }

    private static void addValueAndDisplay(int[] arrayInts) {
        for (int i=2;i<arrayInts.length;i+=3){
            arrayInts[i] += arrayInts[i-1];
        }
        printArray(arrayInts);
    }

    private static void initializeArrayAndDisplay(int[] arrayInts) {
        for(int i=0;i<10;i++){
            arrayInts[i] = i+1;
            System.out.print(arrayInts[i]+" ");
        }
        System.out.println("\n======");
    }

    private static void printArray(int[] arrayInts) {
        for(int i=0;i<arrayInts.length;i++){
            System.out.print(arrayInts[i]+" ");
        }
        System.out.println("\n======");
    }
}

