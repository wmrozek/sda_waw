package wmrozek.utils;

import java.util.Scanner;

public class Utils {
    private static Scanner scanner;

    public static String readStringFromConsole(){
        if (scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner.nextLine();
    }

    public static Integer readIntFromConsole(){
        String stringValue = readStringFromConsole();
        try{
            return Integer.parseInt(stringValue);
        }catch(NumberFormatException e){
            return null;
        }
    }

    public static Long longOrNull(String value){
        try{
            return Long.parseLong(value);
        }catch(NumberFormatException e){
            return null;
        }
    }

    public static Integer integerOrNull(String value){
        try{
            return Integer.parseInt(value);
        }catch(NumberFormatException e){
            return null;
        }
    }

    public static Integer integerOrNull(char value){
        try{
            return Integer.parseInt(String.valueOf(value));
        }catch(NumberFormatException e){
            return null;
        }
    }
}
