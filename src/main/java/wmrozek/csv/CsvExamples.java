package wmrozek.csv;

import wmrozek.csv.model.Persona;
import wmrozek.csv.service.PersonaConverter;
import wmrozek.utils.CsvUtils;

import java.util.List;
import java.util.stream.Collectors;

public class CsvExamples {
    public static void main(String[] args) {
        String filePath = "E:/SDA/baza.csv";
        List<String[]> people = CsvUtils.readCsvFile(filePath);
        List<String[]> peopleFromStream = CsvUtils.readCsvFileByStream(filePath);

        System.out.println(people.size());
        System.out.println(peopleFromStream.size());

        List<Persona> result = PersonaConverter.convertFromListOfArrays(people);
        System.out.println("Rozmiar listy: "+result.size());

        //Wyświetlić pierwsze 20 osób z najwyższymi dochodami
        List<Persona> max20Salaries = result.stream().sorted(
                (o1, o2) -> o2.getSalary().compareTo(o1.getSalary())
        ).limit(20).collect(Collectors.toList());
        max20Salaries.forEach(persona -> System.out.println(
                String.format(
                        "Nazwisko %s, Pensja %d", persona.getSurname(), persona.getSalary())));



    }
}
