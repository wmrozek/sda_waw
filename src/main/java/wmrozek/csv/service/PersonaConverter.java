package wmrozek.csv.service;

import wmrozek.csv.model.Gender;
import wmrozek.csv.model.Persona;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PersonaConverter {

    private static Random randomGenerator = new Random();

    public static List<Persona> convertFromListOfArrays(List<String[]> input){
        int[] indexOrder = new int[]{1,2, 8,3,0,10}; //HACK, nie stosować :)
        List<Persona> result = input.stream()
                .filter(line -> integerOrNull(line[indexOrder[2]]) != null)
                .map(line -> {
            String name = line[indexOrder[0]].replaceAll("\"", "");
            String surname = line[indexOrder[1]].replaceAll("\"", "");
            Integer age = integerOrNull(line[indexOrder[2]]);
            String city = line[indexOrder[3]];
            Gender gender = Gender.getGender(line[indexOrder[4]]);
            String occupation = line[indexOrder[5]].replaceAll("\"", "");
            Integer salary = generateSalary();
            return new Persona(name, surname, age, city, gender, occupation, salary);
        }).collect(Collectors.toList());
        return result;
    }

    private static Integer generateSalary(){
        return randomGenerator.nextInt(1000000);
    }

    private static Integer integerOrNull(String value){
        try{
            return Integer.parseInt(value);
        }catch(NumberFormatException e){
            return null;
        }
    }
}
