package utilities;

import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.java.Log;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log
public class FileUtil {


    public static List<String> getRegDataBasedOnRegx(String string) throws IOException {
        Pattern regex = Pattern.compile("[A-Z][A-Z]\\s?([0][2-9]|[1-9][0-9])\\s?[A-Z]{3}");
        Matcher regexMatcher = regex.matcher(string);
        List<String> registrationNumbersList = new ArrayList<String>();
        while (regexMatcher.find()) {
            if (regexMatcher.group(0) != null) {
                registrationNumbersList.add(regexMatcher.group(0).replaceAll(" ","").trim());
            }
        }
        log.info("Registration Numbers Extracted from the File ...." + registrationNumbersList);
        return registrationNumbersList.stream().sorted().collect(Collectors.toList());

    }

    /**
     * Read the File and Return as String
     *
     * @param filePath
     * @return
     */
    public static String readInputFileAsString(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }


    public static Map<String, CSVReader> getDataFromCSV(String fileName) throws FileNotFoundException {

        Map<String, CSVReader> map = new HashMap<>();
        List<CSVReader> csvParsedData = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(CSVReader.class).build().parse();
        for (CSVReader csvRecord : csvParsedData) {
            CSVReader csvData = new CSVReader();
            csvData.setREGISTRATION(csvRecord.getREGISTRATION());
            csvData.setMAKE(csvRecord.getMAKE());
            csvData.setMODEL(csvRecord.getMODEL());
            csvData.setCOLOR(csvRecord.getCOLOR());
            csvData.setYEAR(csvRecord.getYEAR());
            map.put(csvData.getREGISTRATION(), csvData);
        }
        return map;
    }
}
