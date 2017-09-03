package wmrozek;

import wmrozek.utils.CsvUtils;

import java.util.List;

public class CsvExamples {
    public static void main(String[] args) {
        String filePath = "E:/SDA/baza.csv";
        List<String[]> people = CsvUtils.readCsvFile(filePath);
        List<String[]> peopleFromStream = CsvUtils.readCsvFileByStream(filePath);

        System.out.println(people.size());
        System.out.println(peopleFromStream.size());

    }
}
