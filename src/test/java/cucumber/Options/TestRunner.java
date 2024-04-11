package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features/checkRateValidation.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports.json", "html:src/output/report.html", "html:target/cucumber-html-report", "usage:target/cucumber-usage.json","pretty:target/cucumber-pretty.txt" }

)
public class TestRunner {

}
