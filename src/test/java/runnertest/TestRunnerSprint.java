package runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\Feature2\\Search.feature",
		glue="TestSprint",
		monochrome=true
		
		)

public class TestRunnerSprint {

}
