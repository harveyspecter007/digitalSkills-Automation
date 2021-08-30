import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@UI"},
        plugin = {"pretty", "junit:target/cucumber-junit-report.xml", "html:target/reports/digiSkills",
                "json:target/cucumber.json"},
        features = "src/test/resources/features/")
public class UITestRunner {
}
