package wmrozek.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCsv {
    public static void main(String[] args) {
        readFileIntoCollection();
    }

    private static void readFileIntoCollection() {
        String csvFile = "E:/SDA/baza.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            List<String[]> people = br.lines().parallel().map(e -> {
                String[] person = e.split(cvsSplitBy);
                return person;

            }).collect(Collectors.toList());
//            while ((line = br.readLine()) != null) {
//
//                // use comma as separator
//                String[] person = line.split(cvsSplitBy);
//                System.out.println(person[0]+ " "+person[1]+ " "+person[2]+ " "+person[3]);
//            }
            System.out.println(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
