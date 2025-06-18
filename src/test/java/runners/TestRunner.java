package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features/login.feature",
    glue = {"stepDefinitions"},
    plugin = {"pretty", "json:target/jsonReports/cucumber-report.json"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

