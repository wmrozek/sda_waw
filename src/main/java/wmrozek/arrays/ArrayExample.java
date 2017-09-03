package wmrozek.arrays;

import wmrozek.model.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
//        runExample();

        List<Person> list
                = readFile();
    }

    private static List<Person> readFile(){
        try (InputStream fileIn = new FileInputStream("E:\\personList.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return ((ArrayList<Person>) in.readObject());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

    private static void runExample() {
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
