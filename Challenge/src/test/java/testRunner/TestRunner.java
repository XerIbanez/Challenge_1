package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Criz//IdeaProjects//Challenge//Features//ChallengeAmazon.feature",
        glue = "stepDefinitions"
)

public class TestRunner {

}
