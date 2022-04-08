package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features ="src/test/java/features", glue="stepDefination", tags="@SmokeTest or @RegTest")
public class testNGRunner extends AbstractTestNGCucumberTests{

}
