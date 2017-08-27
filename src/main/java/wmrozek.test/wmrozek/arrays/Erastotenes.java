package wmrozek.arrays;

public class Erastotenes {
    public static void main(String[] args) {
        int elemCount = 500;
        boolean[] results = new boolean[elemCount];
        doSearch(elemCount, results);

        for (int i=0;i<results.length;i++){
            if (!results[i]){
                System.out.print((i+1)+" ");
            }
        }
    }

    private static void doSearch(int elemCount, boolean[] results) {
        for(int i=2;i<=elemCount;i++){
            if (results[i-1]){
                continue;
            }
            int counter = i;
            while (counter <=elemCount){
                counter+=i;
                if (counter <=elemCount){
                    results[counter-1] = true;
                }
            }
        }
    }
}
