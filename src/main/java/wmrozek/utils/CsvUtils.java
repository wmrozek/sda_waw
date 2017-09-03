package wmrozek.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CsvUtils {
    public static List<String[]> readCsvFile(String filePath){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            List<String[]> result = new ArrayList<String[]>();
            String line = br.readLine();
            String delimiter = ",";
            while  (line != null){
                String[] row = line.split(delimiter);
                result.add(row);
                line = br.readLine();
            }
            return result;
        }catch(FileNotFoundException e){
            System.err.println("Nie udało się odnaleźć pliku");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas otwierania pliku, przyczyna: "+e.getMessage());
        }
        return new ArrayList<>();
    }

    public static List<String[]> readCsvFileByStream(String filePath){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String delimiter = ",";
            List<String[]> result = br.lines()
                    .map(line -> line.split(delimiter))
                    .collect(Collectors.toList());
            return result;
        }catch(FileNotFoundException e){
            System.err.println("Nie udało się odnaleźć pliku");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas otwierania pliku, przyczyna: "+e.getMessage());
        }
        return new ArrayList<>();
    }
}
