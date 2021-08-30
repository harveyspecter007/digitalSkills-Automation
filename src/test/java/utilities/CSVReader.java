package utilities;
import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CSVReader {

    @CsvBindByName
    private String REGISTRATION;

    @CsvBindByName
    private String MAKE;

    @CsvBindByName
    private String MODEL;

    @CsvBindByName
    private String COLOR;

    @CsvBindByName
    private String YEAR;

}
