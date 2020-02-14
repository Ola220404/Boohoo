package co.uk.runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/features"},
        plugin = {"pretty", "json:target/report.jason",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue = {"co/uk/boohoo/hooks","co/uk/boohoo/stepdefinations"}

        )
public class TestRunner {
}
