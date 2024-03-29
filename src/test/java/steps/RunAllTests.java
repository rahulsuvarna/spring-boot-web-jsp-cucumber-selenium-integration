package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        format = {"pretty", "html:target/cucumber-reports"},
        tags = "~@WIP")
public class RunAllTests {
}
